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
 * Data Access Object (DAO) for listing certificate issuers.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing certificate issuers.")
public class CertificateIssuerListDao extends AbstractModelListDao<CertificateIssuer, CertificateIssuerListOptions>
                                      implements ModelListDao<CertificateIssuer, CertificateIssuerListOptions> {
    /**
     * Constructor.
     */
    public CertificateIssuerListDao() throws MbedCloudException {
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
    public CertificateIssuerListDao clone() {
        try {
            return new CertificateIssuerListDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                             : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * a certificate issuer dao.
     * 
     * @return a certificate issuer dao
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public CertificateIssuerDao getCorrespondingModelDao() throws MbedCloudException {
        return new CertificateIssuerDao().configureAndGet(getModuleOrThrow());
    }

    /**
     * a certificate issuer dao class.
     * 
     * @return a certificate issuer dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<CertificateIssuerDao> getCorrespondingModelDaoDefinition() {
        return CertificateIssuerDao.class;
    }

    /**
     * a certificate issuer list options.
     * 
     * @return a certificate issuer list options
     */
    @Override
    @Internal
    protected CertificateIssuerListOptions instantiateListOptions() {
        return new CertificateIssuerListOptions();
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
     * Lists certificate issuers matching filter options.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Security#listCertificateIssuers(CertificateIssuerListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of certificate issuers
     */
    @Override
    protected ListResponse<CertificateIssuer>
              requestOnePage(CertificateIssuerListOptions options) throws MbedCloudException {
        return ((Security) getModuleOrThrow()).listCertificateIssuers(options);
    }
}
