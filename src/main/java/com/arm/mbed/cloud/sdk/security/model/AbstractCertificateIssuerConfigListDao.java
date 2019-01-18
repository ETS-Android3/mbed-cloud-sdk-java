// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [CertificateIssuerConfigListDao]
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.Security;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelListDao;
import com.arm.mbed.cloud.sdk.common.dao.ModelListDao;

/**
 * Data Access Object (DAO) for listing certificate issuer configs.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing certificate issuer configs.")
public abstract class AbstractCertificateIssuerConfigListDao extends
                                                             AbstractModelListDao<CertificateIssuerConfig,
                                                                                  CertificateIssuerConfigListOptions>
                                                             implements
                                                             ModelListDao<CertificateIssuerConfig,
                                                                          CertificateIssuerConfigListOptions> {
    /**
     * Constructor.
     */
    public AbstractCertificateIssuerConfigListDao() throws MbedCloudException {
        super();
    }

    /**
     * a certificate issuer config dao.
     * 
     * @return a certificate issuer config dao
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public CertificateIssuerConfigDao getCorrespondingModelDao() throws MbedCloudException {
        return new CertificateIssuerConfigDao().configureAndGet(module);
    }

    /**
     * a certificate issuer config dao class.
     * 
     * @return a certificate issuer config dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<CertificateIssuerConfigDao> getCorrespondingModelDaoDefinition() {
        return CertificateIssuerConfigDao.class;
    }

    /**
     * a certificate issuer config list options.
     * 
     * @return a certificate issuer config list options
     */
    @Override
    @Internal
    protected CertificateIssuerConfigListOptions instantiateListOptions() {
        return new CertificateIssuerConfigListOptions();
    }

    /**
     * Instantiates modules.
     * 
     * @param client
     *            an api client wrapper.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ApiClientWrapper client) {
        return new Security(client);
    }

    /**
     * Instantiates modules.
     * 
     * @param context
     *            an sdk context.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(SdkContext context) {
        return new Security(context);
    }

    /**
     * Instantiates modules.
     * 
     * @param options
     *            a connection options.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ConnectionOptions options) {
        return new Security(options);
    }
}
