// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import com.arm.mbed.cloud.sdk.Devices;
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
 * Data Access Object (DAO) for listing device enrollments.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing device enrollments.")
public class DeviceEnrollmentListDao extends AbstractModelListDao<DeviceEnrollment, DeviceEnrollmentListOptions>
                                     implements ModelListDao<DeviceEnrollment, DeviceEnrollmentListOptions> {
    /**
     * Constructor.
     * 
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    public DeviceEnrollmentListDao() throws MbedCloudException {
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
    public DeviceEnrollmentListDao(ApiClientWrapper client) throws MbedCloudException {
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
    public DeviceEnrollmentListDao(ConnectionOptions options) throws MbedCloudException {
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
    public DeviceEnrollmentListDao(SdkContext sdkContext) throws MbedCloudException {
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
    public DeviceEnrollmentListDao clone() {
        try {
            return new DeviceEnrollmentListDao().configureAndGet(getModuleOrThrow() == null ? null
                                                                                            : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * a device enrollment dao class.
     * 
     * @return a device enrollment dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<DeviceEnrollmentDao> getModelDaoClass() {
        return DeviceEnrollmentDao.class;
    }

    /**
     * a device enrollment dao.
     * 
     * @return a device enrollment dao
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public DeviceEnrollmentDao getNewModelDao() throws MbedCloudException {
        return new DeviceEnrollmentDao().configureAndGet(getModuleOrThrow());
    }

    /**
     * a device enrollment list options.
     * 
     * @return a device enrollment list options
     */
    @Override
    @Internal
    protected DeviceEnrollmentListOptions instantiateListOptions() {
        return new DeviceEnrollmentListOptions();
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
        return new Devices(client);
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
        return new Devices(options);
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
        return new Devices(context);
    }

    /**
     * Lists device enrollments matching filter options.
     *
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.Devices#listDeviceEnrollments(com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of device enrollments
     * @throws MbedCloudException
     *             if an error occurs during the process.
     */
    @Override
    protected ListResponse<DeviceEnrollment>
              requestOnePage(DeviceEnrollmentListOptions options) throws MbedCloudException {
        return ((Devices) getModuleOrThrow()).listDeviceEnrollments(options);
    }
}
