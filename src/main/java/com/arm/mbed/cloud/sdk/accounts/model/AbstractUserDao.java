// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [UserDao]
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;

/**
 * Data Access Object (DAO) for users.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for users.")
public abstract class AbstractUserDao extends AbstractModelDao<User> implements CrudDao<User> {
    /**
     * Constructor.
     */
    public AbstractUserDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#createUser(String,User)}
     * 
     * @param action
     *            Action, either 'create' or 'invite'.
     * @return an added user
     */
    public User create(@Nullable @DefaultValue("create") String action) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).createUser(action, getModel()));
        return getModel();
    }

    /**
     * Deletes a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteUser(User)}
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteUser(getModel());
    }

    /**
     * Deletes a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteUser(User)}
     * 
     * @param user
     *            a user.
     */
    @Override
    public void delete(@NonNull User user) throws MbedCloudException {
        setModel(user);
        delete();
    }

    /**
     * Deletes a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteUser(String)}
     * 
     * @param id
     *            The ID of the user to be deleted.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteUser(id);
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected User instantiateModel() {
        return new User();
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
     * @param client
     *            an api client wrapper.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ApiClientWrapper client) {
        return new Accounts(client);
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
     * Gets a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#readUser(User)}
     * 
     * @return something
     */
    @Override
    public User read() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).readUser(getModel()));
        return getModel();
    }

    /**
     * Gets a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#readUser(String)}
     * 
     * @param id
     *            The ID of the user.
     * @return something
     */
    @Override
    public User read(@NonNull String id) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).readUser(id));
        return getModel();
    }

    /**
     * Modifies a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateUser(User)}
     * 
     * @return something
     */
    @Override
    public User update() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).updateUser(getModel()));
        return getModel();
    }

    /**
     * Modifies a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateUser(User)}
     * 
     * @param user
     *            a user.
     * @return something
     */
    @Override
    public User update(@NonNull User user) throws MbedCloudException {
        setModel(user);
        return update();
    }

    /**
     * Modifies a user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateUser(String,User)}
     * 
     * @param id
     *            The ID of the user.
     * @return an updated user
     */
    public User update(@NonNull String id) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).updateUser(id, getModel()));
        return getModel();
    }
}
