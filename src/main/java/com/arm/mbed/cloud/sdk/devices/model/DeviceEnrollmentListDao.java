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
     */
    public DeviceEnrollmentListDao() throws MbedCloudException {
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
    public DeviceEnrollmentListDao clone() {
        try {
            return new DeviceEnrollmentListDao().configureAndGet(module == null ? null : module.clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * a device enrollment dao.
     * 
     * @return a device enrollment dao
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public DeviceEnrollmentDao getCorrespondingModelDao() throws MbedCloudException {
        return new DeviceEnrollmentDao().configureAndGet(module);
    }

    /**
     * a device enrollment dao class.
     * 
     * @return a device enrollment dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<DeviceEnrollmentDao> getCorrespondingModelDaoDefinition() {
        return DeviceEnrollmentDao.class;
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
     * Lists device enrollments matching filter options.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Devices#listDeviceEnrollments(DeviceEnrollmentListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of device enrollments
     */
    @Override
    protected ListResponse<DeviceEnrollment>
              requestOnePage(DeviceEnrollmentListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Devices) module).listDeviceEnrollments(options);
    }
}
