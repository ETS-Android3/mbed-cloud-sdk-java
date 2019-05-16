// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Thu May 02 10:47:50 UTC 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import com.arm.mbed.cloud.sdk.annotations.NotImplemented;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.SdkContext;

/**
 * Data Access Object (DAO) for firmware images.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for firmware images.")
public class FirmwareImageDao extends AbstractFirmwareImageDao {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public FirmwareImageDao() throws MbedCloudException {
        super();
    }

    /**
     * Constructor.
     * 
     * @param client
     *            an api client wrapper.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public FirmwareImageDao(ApiClientWrapper client) throws MbedCloudException {
        super(client);
    }

    /**
     * Constructor.
     * 
     * @param options
     *            a connection options.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public FirmwareImageDao(ConnectionOptions options) throws MbedCloudException {
        super(options);
    }

    /**
     * Constructor.
     * 
     * @param sdkContext
     *            an sdk context.
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public FirmwareImageDao(SdkContext sdkContext) throws MbedCloudException {
        super(sdkContext);
    }

    /**
     * Clones this instance.
     *
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    @SuppressWarnings({ "resource", "unused" })
    public FirmwareImageDao clone() {
        try {
            return new FirmwareImageDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                     : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Executes create.
     * 
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public FirmwareImage create() throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Executes create.
     * 
     * @param modelToCreate
     *            an sdk model.
     * @return something
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @NotImplemented
    public FirmwareImage create(FirmwareImage modelToCreate) throws MbedCloudException, NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }
}
