// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [UserListDao]
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelListDao;
import com.arm.mbed.cloud.sdk.common.dao.ModelListDao;

/**
 * Data Access Object (DAO) for listing users.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing users.")
public abstract class AbstractUserListDao extends AbstractModelListDao<User, UserListOptions>
                                          implements ModelListDao<User, UserListOptions> {
    /**
     * Constructor.
     */
    public AbstractUserListDao() throws MbedCloudException {
        super();
    }

    /**
     * a user dao.
     * 
     * @return a user dao
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public UserDao getCorrespondingModelDao() throws MbedCloudException {
        return new UserDao().configureAndGet(getModuleOrThrow());
    }

    /**
     * a user dao class.
     * 
     * @return a user dao class
     */
    @Override
    @Internal
    @SuppressWarnings("unchecked")
    public Class<UserDao> getCorrespondingModelDaoDefinition() {
        return UserDao.class;
    }

    /**
     * a user list options.
     * 
     * @return a user list options
     */
    @Override
    @Internal
    protected UserListOptions instantiateListOptions() {
        return new UserListOptions();
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
        return new Accounts(options);
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
        return new Accounts(context);
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
        return new Accounts(client);
    }
}
