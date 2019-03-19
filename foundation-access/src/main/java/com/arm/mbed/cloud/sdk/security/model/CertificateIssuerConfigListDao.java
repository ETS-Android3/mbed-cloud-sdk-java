// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
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
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;

/**
 * Data Access Object (DAO) for listing certificate issuer configs.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing certificate issuer configs.")
public class CertificateIssuerConfigListDao extends
                                            AbstractModelListDao<CertificateIssuerConfig,
                                                                 CertificateIssuerConfigListOptions>
                                            implements
                                            ModelListDao<CertificateIssuerConfig, CertificateIssuerConfigListOptions> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public CertificateIssuerConfigListDao() throws MbedCloudException {
        super();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    @SuppressWarnings({ "unused", "resource" })
    public CertificateIssuerConfigListDao clone() {
        try {
            return new CertificateIssuerConfigListDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                                   : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * a certificate issuer config dao class.
     * 
     * @return a certificate issuer config dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<CertificateIssuerConfigDao> getModelDaoClass() {
        return CertificateIssuerConfigDao.class;
    }

    /**
     * a certificate issuer config dao.
     * 
     * @return a certificate issuer config dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public CertificateIssuerConfigDao getNewModelDao() throws MbedCloudException {
        return new CertificateIssuerConfigDao().configureAndGet(getModuleOrThrow());
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
     * @param options
     *            a connection options.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ConnectionOptions options) {
        return new Security(options);
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
     * Lists certificate issuer configs matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#listCertificateIssuerConfigs(com.arm.mbed.cloud.sdk.security.model.CertificateIssuerConfigListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of certificate issuer configs
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    protected ListResponse<CertificateIssuerConfig>
              requestOnePage(CertificateIssuerConfigListOptions options) throws MbedCloudException {
        return ((Security) getModuleOrThrow()).listCertificateIssuerConfigs(options);
    }
}
