// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [SubtenantUserDao]
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
 * Data Access Object (DAO) for subtenant users.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for subtenant users.")
public abstract class AbstractSubtenantUserDao extends AbstractModelDao<SubtenantUser>
                                               implements CrudDao<SubtenantUser> {
    /**
     * Constructor.
     */
    public AbstractSubtenantUserDao() throws MbedCloudException {
        super();
    }

    /**
     * Adds a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#createSubtenantUser(String,SubtenantUser)}
     * 
     * @param action
     *            Create or invite user.
     * @return something
     */
    public SubtenantUser create(@Nullable @DefaultValue("create") String action) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).createSubtenantUser(action, getModel()));
        return getModel();
    }

    /**
     * Adds a subtenant user.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#createSubtenantUser(String,String,SubtenantUser)}
     * 
     * @param action
     *            Create or invite user.
     * @param accountId
     *            The ID of the account.
     * @return an added subtenant user
     */
    public SubtenantUser create(@Nullable @DefaultValue("create") String action,
                                @NonNull String accountId) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).createSubtenantUser(action, accountId, getModel()));
        return getModel();
    }

    /**
     * Deletes a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#deleteSubtenantUser(SubtenantUser)}
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteSubtenantUser(getModel());
    }

    /**
     * Deletes a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#deleteSubtenantUser(SubtenantUser)}
     * 
     * @param subtenantUser
     *            a subtenant user.
     */
    @Override
    public void delete(@NonNull SubtenantUser subtenantUser) throws MbedCloudException {
        setModel(subtenantUser);
        delete();
    }

    /**
     * Deletes a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#deleteSubtenantUser(String,String)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the user to be deleted.
     */
    public void delete(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteSubtenantUser(accountId, id);
    }

    /**
     * Gets a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#getSubtenantUser(SubtenantUser)}
     * 
     * @return something
     */
    @Override
    public SubtenantUser get() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).getSubtenantUser(getModel()));
        return getModel();
    }

    /**
     * Gets a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#getSubtenantUser(String,String)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param id
     *            The ID of the user.
     * @return something
     */
    public SubtenantUser get(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).getSubtenantUser(accountId, id));
        return getModel();
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected SubtenantUser instantiateModel() {
        return new SubtenantUser();
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
     * Modifies a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#updateSubtenantUser(SubtenantUser)}
     * 
     * @return something
     */
    @Override
    public SubtenantUser update() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).updateSubtenantUser(getModel()));
        return getModel();
    }

    /**
     * Modifies a subtenant user.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#updateSubtenantUser(SubtenantUser)}
     * 
     * @param subtenantUser
     *            a subtenant user.
     * @return something
     */
    @Override
    public SubtenantUser update(@NonNull SubtenantUser subtenantUser) throws MbedCloudException {
        setModel(subtenantUser);
        return update();
    }

    /**
     * Modifies a subtenant user.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#updateSubtenantUser(String,String,SubtenantUser)}
     * 
     * @param accountId
     *            The ID of the account.
     * @param id
     *            The ID of the user.
     * @return an updated subtenant user
     */
    public SubtenantUser update(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).updateSubtenantUser(accountId, id, getModel()));
        return getModel();
    }

    /**
     * Validate the user email.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#validateEmail(SubtenantUser)}
     */
    public void validateEmail() throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).validateEmail(getModel());
    }

    /**
     * Validate the user email.
     * 
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.SubtenantUser#validateEmail(String,String)}
     * 
     * @param accountId
     *            Account ID.
     * @param id
     *            The ID of the user whose email is validated.
     */
    public void validateEmail(@NonNull String accountId, @NonNull String id) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).validateEmail(accountId, id);
    }
}
