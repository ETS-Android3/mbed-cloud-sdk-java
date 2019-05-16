// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model FirmwareManifest.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestFirmwareManifest {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1558000749682L), 95,
                                                                      "c6786e1b-e092-4459-ae59-0c4a6c7a7478",
                                                                      "1071180c-af06-42c9-989b-9ebace02da1c",
                                                                      "785d4184-23a8-488b-8de5-f1da822ba19d",
                                                                      "20e1463f-fd1f-4d73-b01f-226a695e18d6",
                                                                      "9ab9b815-4ae0-427c-8b18-c89f5aa74c8a",
                                                                      "280103cb-d42b-4cec-901c-eac0ebb1531a",
                                                                      new Date(1558000746707L),
                                                                      new Date(1558000748346L));
            FirmwareManifest firmwaremanifest2 = firmwaremanifest1.clone();
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1558000755186L), 106,
                                                                      "1b303879-06ad-41b2-855f-a3a56a34a928",
                                                                      "5d9a5960-f857-4fc5-b881-9d6892d3b1e5",
                                                                      "9f1f533a-f0fd-4e85-ada0-29d5a0d7b681",
                                                                      "daed989f-a84c-48f8-b218-88c3864ea580",
                                                                      "c5bbaa90-164d-45b9-897b-af31824c3bf8",
                                                                      "e58f23d6-dc39-4b5f-b088-7128a52e0263",
                                                                      new Date(1558000750686L),
                                                                      new Date(1558000755490L));
            FirmwareManifest firmwaremanifest2 = new FirmwareManifest(new Date(1558000755186L), 106,
                                                                      "1b303879-06ad-41b2-855f-a3a56a34a928",
                                                                      "5d9a5960-f857-4fc5-b881-9d6892d3b1e5",
                                                                      "9f1f533a-f0fd-4e85-ada0-29d5a0d7b681",
                                                                      "daed989f-a84c-48f8-b218-88c3864ea580",
                                                                      "c5bbaa90-164d-45b9-897b-af31824c3bf8",
                                                                      "e58f23d6-dc39-4b5f-b088-7128a52e0263",
                                                                      new Date(1558000750686L),
                                                                      new Date(1558000755490L));
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2.hashCode(), firmwaremanifest1.hashCode());
            int hashCode = firmwaremanifest1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, firmwaremanifest1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        FirmwareManifest firmwaremanifest = new FirmwareManifest(new Date(1558000754740L), 116,
                                                                 "95625299-705a-42cc-9fed-c48ed2fde2a4",
                                                                 "ddda37b0-fb1b-4bd9-8271-ea944ef8cd23",
                                                                 "2fe63c06-3818-489e-98e9-d4df51a22534",
                                                                 "0e5f78af-d6f8-4f0f-802d-dbbeeb10e52d",
                                                                 "48db169f-1e74-42c9-b85b-7f5f5db3c98d",
                                                                 "aba0d1f7-ae16-465f-a31d-55265c9af7be",
                                                                 new Date(1558000754947L), new Date(1558000750079L));
        assertTrue(firmwaremanifest.isValid());
        FirmwareManifest firmwaremanifestInvalid = new FirmwareManifest(new Date(1558000750935L), -25,
                                                                        "06fcd06d-8190-46d6-b1d2-64018ffff060",
                                                                        "326eb912-8bc5-4636-b507-4b24427cc27f579936c0-cdc9-42f0-a759-cb9f56bb8c11bab77503-87a2-4b9d-a894-3785923d1d3529e6436e-0701-46aa-8949-73d2d10185890fe17011-85b7-44a9-bdfa-26bf8c818c9c58cdb198-5e6f-47c4-907e-8f344d67be9050252212-c364-428e-b0c8-424d987d97bc7b00f449-5f09-4c74-98f9-59f0e5b6b09f959c7b72-5233-4fb3-a219-7ce35aba0e8d6f05e5ac-6897-4cc3-8cca-414cbdce62c6e5ff57e1-2563-4d68-948a-4db52ef528a1d2d53540-e7a6-4d93-8944-f536a6c1811be773b391-6b96-4e86-87b5-f20e8fbf3ccc03b1de05-8da3-4bac-beec-f7bf30118ed3ce731040-bd28-4471-a68f-4b676bab6a6e7462b04c-16c9-4d3d-8931-56bef4f46c2a883fbcc7-f6da-44bd-b9d4-9276a65bf1ce6a7eb2ed-d8c0-40a7-a5f3-5f4dec49492fe0a33819-d1f7-4d10-a770-cdb0b0f999a19b1b9a64-e65c-4771-8d96-ab996ca28d74a772cb4e-fe92-466d-8776-bc3f978e57f1f3cd87ed-0796-42a5-a120-cc432678055e65be08db-2b3c-478c-9bc9-1529304963465587b8fa-17c5-42ce-a483-9e78f9583eebe131ac25-0e9e-48ad-9cd1-673b84d2729868993aac-31f2-47bc-a8f8-cb60812618de496a7d0d-152f-4e16-ac11-1d364216554789c7fc75-e650-4430-bed1-7130b96f67bf52ee3882-ba1d-4c09-b562-f215e0f3ee33c1a3bbd8-cbd4-4671-8107-444588bd2068ad35fc26-55c1-4abc-b860-f003b36196e445ab9605-6430-4d1f-b10a-b16da4ca57404251bd63-a8e4-488d-b360-406b5bae58e07db5881b-5687-4400-8bd8-ee602d84db7171ca7bf7-f539-47e5-94db-a287285871d554802d6f-b37a-4e4b-a279-5cdeba4e2c5ca6f08f5c-004e-45fd-b20f-3d4589cfc47b54475fc6-9ea6-4667-b7b7-bb987658919404d01ccf-8f0f-41e1-9873-d6af08485d7f923ad7ee-d0e5-4af5-b526-9e37f3dadde8fb6ba1e1-589a-4421-8e32-a9eb23f5a31f7e3eeb58-fd8b-4683-88e1-fe77f9dc9e7e990ecfb6-4a46-4352-ae9d-758520bcc2f586a23f97-fa5a-4ec9-bc0a-4de6482a9d16f0ca6327-e158-4806-8bda-88fc38de3aa4be3cfaca-6e82-45a6-aab4-de52309085818dc960ef-fbd9-456a-8fdc-4c033f61ffa0cec36f8a-3d74-4978-ac71-30c330b2ab73c6df8158-8a9f-4fd4-b50b-dac2fcb61d04619b8d48-3079-4b0d-b4ff-0458b383083f335a14bf-89f3-4af9-bbb9-b2b4dd584058006b9f70-e1c7-48ae-bae7-929e5a186b58f46c81ba-49f2-4f13-acf0-eb19fae48552fca03536-a840-4447-a291-fb32e9f1a568a80b8581-1d69-4c9e-be51-fd06121b0846db56442d-d316-4a44-aa8b-d59ed07f7de6",
                                                                        "12e564fb-78dd-43f5-8985-958ec12623d3",
                                                                        "965bb01f-b48b-443a-9a7c-0ba38008525a",
                                                                        "425c6e8d-65aa-4393-875f-e229442deb5b",
                                                                        "d199f17e-eea6-476c-ad1c-b3799258f5c767d3762a-bda3-44b2-be5a-7c608b5d8b0a04e3f6e2-20d3-4a08-b4a1-ae9bfc81a380c1568978-8c26-46ea-ae83-43775dd06bdd",
                                                                        new Date(1558000752252L),
                                                                        new Date(1558000755259L));
        assertFalse(firmwaremanifestInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1558000749258L), -78,
                                                                      "5ca16224-4286-4e77-b578-e2887277fb2f",
                                                                      "e8009ca4-ba51-483f-b8fc-cb58866a43d8",
                                                                      "3503fe5d-0194-4cba-a6ff-b8b0335d1f00",
                                                                      "c9222e28-cf45-46fb-93e7-43685f571437",
                                                                      "a2d9945b-ce36-4e3e-b391-881dc4dfe0ff",
                                                                      "f660f173-61e4-4d76-9373-4988903b1d77",
                                                                      new Date(1558000753408L),
                                                                      new Date(1558000753863L));
            FirmwareManifest firmwaremanifest2 = new FirmwareManifest(new Date(1558000749258L), -78,
                                                                      "5ca16224-4286-4e77-b578-e2887277fb2f",
                                                                      "e8009ca4-ba51-483f-b8fc-cb58866a43d8",
                                                                      "3503fe5d-0194-4cba-a6ff-b8b0335d1f00",
                                                                      "c9222e28-cf45-46fb-93e7-43685f571437",
                                                                      "a2d9945b-ce36-4e3e-b391-881dc4dfe0ff",
                                                                      "f660f173-61e4-4d76-9373-4988903b1d77",
                                                                      new Date(1558000753408L),
                                                                      new Date(1558000753863L));
            FirmwareManifest firmwaremanifest3 = new FirmwareManifest(new Date(1558000755680L), 25,
                                                                      "d3244239-596c-4a3b-be82-a82a375860d9",
                                                                      "abf51848-7043-4e73-8924-a80e341180b3",
                                                                      "beb5a062-19ac-43a5-97f1-f550fc19d08f",
                                                                      "6be69e35-95b9-4a8e-84d9-60c767ad82d3",
                                                                      "d90491a5-8c76-4296-b4a6-018f7163f3a0",
                                                                      "92a37e4b-f20c-41df-965a-14b3bac0caa8",
                                                                      new Date(1558000755470L),
                                                                      new Date(1558000749232L));
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotNull(firmwaremanifest3);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertNotSame(firmwaremanifest3, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest1, firmwaremanifest2);
            assertEquals(firmwaremanifest1, firmwaremanifest1);
            assertFalse(firmwaremanifest1.equals(null));
            assertNotEquals(firmwaremanifest3, firmwaremanifest1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
