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
 * Data Access Object (DAO) for listing trusted certificates.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing trusted certificates.")
public class TrustedCertificateListDao extends AbstractModelListDao<TrustedCertificate, TrustedCertificateListOptions>
                                       implements ModelListDao<TrustedCertificate, TrustedCertificateListOptions> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public TrustedCertificateListDao() throws MbedCloudException {
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
    public TrustedCertificateListDao clone() {
        try {
            return new TrustedCertificateListDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                              : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * a trusted certificate dao class.
     * 
     * @return a trusted certificate dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<TrustedCertificateDao> getModelDaoClass() {
        return TrustedCertificateDao.class;
    }

    /**
     * a trusted certificate dao.
     * 
     * @return a trusted certificate dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public TrustedCertificateDao getNewModelDao() throws MbedCloudException {
        return new TrustedCertificateDao().configureAndGet(getModuleOrThrow());
    }

    /**
     * a trusted certificate list options.
     * 
     * @return a trusted certificate list options
     */
    @Override
    @Internal
    protected TrustedCertificateListOptions instantiateListOptions() {
        return new TrustedCertificateListOptions();
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
     * Lists trusted certificates matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Security#listTrustedCertificates(com.arm.mbed.cloud.sdk.security.model.TrustedCertificateListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of trusted certificates
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    protected ListResponse<TrustedCertificate>
              requestOnePage(TrustedCertificateListOptions options) throws MbedCloudException {
        return ((Security) getModuleOrThrow()).listTrustedCertificates(options);
    }
}
