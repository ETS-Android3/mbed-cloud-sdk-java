package com.arm.pelion.sdk.foundation.generator;

import java.io.File;

import com.arm.pelion.sdk.foundation.generator.cli.GeneratorCli;
import com.arm.pelion.sdk.foundation.generator.cli.Header;
import com.arm.pelion.sdk.foundation.generator.input.FoundationDataLoader;
import com.arm.pelion.sdk.foundation.generator.input.IntermediateApiDefinition;
import com.arm.pelion.sdk.foundation.generator.lowlevelapis.LowLevelAPIFinder;
import com.arm.pelion.sdk.foundation.generator.lowlevelapis.LowLevelAPIs;
import com.arm.pelion.sdk.foundation.generator.model.ArtifactsGenerator;
import com.arm.pelion.sdk.foundation.generator.translator.ArtifactsTranslator;
import com.arm.pelion.sdk.foundation.generator.util.CleanException;
import com.arm.pelion.sdk.foundation.generator.util.FoundationGeneratorException;
import com.arm.pelion.sdk.foundation.generator.util.Logger;
import com.arm.pelion.sdk.foundation.generator.util.TranslationException;

import picocli.CommandLine;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.UnmatchedArgumentException;

public class FoundationGenerator {

    private IntermediateApiDefinition definition;
    private LowLevelAPIs lowLevelAPIs;
    private boolean forceRegenerateUnitTests;
    private final Logger logger;

    public FoundationGenerator() {
        definition = null;
        lowLevelAPIs = null;
        logger = Logger.getLogger();
        forceRegenerateUnitTests = true;
    }

    public void load(GeneratorCli cli, Configuration config) throws FoundationGeneratorException {
        logger.logInfo("Loading low level APIs definition");
        LowLevelAPIFinder apiFinder = new LowLevelAPIFinder(config.getRootPackageName(),
                                                            config.getLowLevelApiModuleNameRegex());
        lowLevelAPIs = apiFinder.find();
        // logger.logInfo(new JsonSerialiser().toJson(lowLevelAPIs));
        logger.logInfo("Loading definitions");
        FoundationDataLoader loader = new FoundationDataLoader();
        cli.getFiles().forEach(f -> loader.addSource(f));
        // loader.addSource("C:\\Users\\adrcab01\\OneDrive - ARM\\Documents\\temp\\test-generation\\inter.yaml");
        // loader.addSource("C:\\Users\\adrcab01\\OneDrive - ARM\\Documents\\temp\\test-generation\\test2.yml");
        loader.load();
        definition = loader.getInput();
    }

    public void generateModels(GeneratorCli cli, Configuration config) throws FoundationGeneratorException {
        File directory = new File("C:\\Users\\adrcab01\\OneDrive - ARM\\Documents\\temp\\test-generation\\results");
        File testDirectory = directory;
        logger.logInfo("Translating generic definitions into Java models");
        ArtifactsGenerator generator = new ArtifactsGenerator(directory, testDirectory,
                                                              ArtifactsTranslator.translate(config, definition,
                                                                                            lowLevelAPIs),
                                                              forceRegenerateUnitTests);
        try {
            generator.clean();
            generator.generate();
        } catch (TranslationException | CleanException exception) {
            // TODO Auto-generated catch block
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GeneratorCli cli = new GeneratorCli();
        CommandLine cmd = new CommandLine(cli);
        FoundationGenerator generator = new FoundationGenerator();

        try {
            cmd.parse(args);
            if (cmd.isUsageHelpRequested()) {
                System.out.println(cli.generateHelp(cmd.getUsageHelpWidth()));
                return;
            } else if (cmd.isVersionHelpRequested()) {
                cmd.printVersionHelp(System.out);
                return;
            }
            generator.logger.logInfo(System.lineSeparator() + Header.getHeader().generateText()
                                     + System.lineSeparator());
            Configuration config = Configuration.load(generator.logger, cli.getConfig());
            generator.load(cli, config);
            generator.generateModels(cli, config);
        } catch (ParameterException ex) {
            System.err.println(ex.getMessage());
            if (!UnmatchedArgumentException.printSuggestions(ex, System.err)) {
                System.err.println(cli.generateHelp(cmd.getUsageHelpWidth()));
            }
            System.exit(1);
        } catch (Exception ex) {
            System.err.println("Error while calling " + cli + " because " + ex.getMessage());
            ex.printStackTrace();
            System.exit(1);
        }

    }
}
