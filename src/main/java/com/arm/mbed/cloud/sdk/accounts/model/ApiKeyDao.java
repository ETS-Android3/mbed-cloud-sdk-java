// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CrudDao;

/**
 * Data Access Object (DAO) for api keys.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for api keys.")
public class ApiKeyDao extends AbstractModelDao<ApiKey> implements CrudDao<ApiKey> {
    /**
     * Constructor.
     */
    public ApiKeyDao() throws MbedCloudException {
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
    public ApiKeyDao clone() {
        try {
            return new ApiKeyDao().configureAndGet(getModuleOrThrow() == null ? null : getModuleOrThrow().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }

    /**
     * Adds an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#createApiKey(ApiKey)}
     * 
     * @return an added api key
     */
    @Override
    public ApiKey create() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).createApiKey(getModel()));
        return getModel();
    }

    /**
     * Adds an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#createApiKey(ApiKey)}
     * 
     * @param apiKey
     *            an api key.
     * @return an added api key
     */
    @Override
    public ApiKey create(@NonNull ApiKey apiKey) throws MbedCloudException {
        setModel(apiKey);
        return create();
    }

    /**
     * Deletes an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteApiKey(ApiKey)}
     */
    @Override
    public void delete() throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteApiKey(getModel());
    }

    /**
     * Deletes an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteApiKey(ApiKey)}
     * 
     * @param apiKey
     *            an api key.
     */
    @Override
    public void delete(@NonNull ApiKey apiKey) throws MbedCloudException {
        setModel(apiKey);
        delete();
    }

    /**
     * Deletes an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#deleteApiKey(String)}
     * 
     * @param id
     *            The ID of the API key to be deleted.
     */
    @Override
    public void delete(@NonNull String id) throws MbedCloudException {
        ((Accounts) getModuleOrThrow()).deleteApiKey(id);
    }

    /**
     * Gets an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#getApiKey(ApiKey)}
     * 
     * @return something
     */
    @Override
    public ApiKey get() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).getApiKey(getModel()));
        return getModel();
    }

    /**
     * Gets an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#getApiKey(String)}
     * 
     * @param id
     *            The ID of the API key.
     * @return something
     */
    @Override
    public ApiKey get(@NonNull String id) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).getApiKey(id));
        return getModel();
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected ApiKey instantiateModel() {
        return new ApiKey();
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
     * Gets my api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#myApiKey()}
     * 
     * @return something
     */
    @SuppressWarnings("PMD.ShortMethodName")
    public ApiKey me() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).myApiKey());
        return getModel();
    }

    /**
     * Modifies an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateApiKey(ApiKey)}
     * 
     * @return something
     */
    @Override
    public ApiKey update() throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).updateApiKey(getModel()));
        return getModel();
    }

    /**
     * Modifies an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateApiKey(ApiKey)}
     * 
     * @param apiKey
     *            an api key.
     * @return something
     */
    @Override
    public ApiKey update(@NonNull ApiKey apiKey) throws MbedCloudException {
        setModel(apiKey);
        return update();
    }

    /**
     * Modifies an api key.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.Accounts#updateApiKey(String,ApiKey)}
     * 
     * @param id
     *            The ID of the API key.
     * @return an updated api key
     */
    public ApiKey update(@NonNull String id) throws MbedCloudException {
        setModel(((Accounts) getModuleOrThrow()).updateApiKey(id, getModel()));
        return getModel();
    }
}
