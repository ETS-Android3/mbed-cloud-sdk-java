// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.Account;
import com.arm.mbed.cloud.sdk.accounts.model.AccountMfaStatus;
import com.arm.mbed.cloud.sdk.accounts.model.AccountStatus;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountCreationReq;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountInfo;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountInfoList;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountUpdateRootReq;
import java.util.List;

/**
 * Adapter for accounts.
 */
@Preamble(description = "Adapter for accounts.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class AccountAdapter {
    /**
     * Constructor.
     */
    private AccountAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps an account info into an account.
     * 
     * @param toBeMapped
     *            an account info.
     * @return mapped an account
     */
    @Internal
    public static Account map(AccountInfo toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final Account account = new Account(toBeMapped.getAdminId(), toBeMapped.getAdminKey(),
                                            TranslationUtils.toDate(toBeMapped.getCreatedAt()),
                                            TranslationUtils.toDate(toBeMapped.getExpiration()), toBeMapped.getLimits(),
                                            ParentAccountAdapter.map(toBeMapped.getParentAccount()),
                                            toBeMapped.getParentId(),
                                            PolicyAdapter.mapSimpleList(toBeMapped.getPolicies()),
                                            toBeMapped.getReason(), toBeMapped.getReferenceNote(),
                                            translateToAccountStatus(toBeMapped.getStatus()),
                                            toBeMapped.getTemplateId(), toBeMapped.getTier(),
                                            TranslationUtils.toDate(toBeMapped.getUpdatedAt()),
                                            TranslationUtils.toDate(toBeMapped.getUpgradedAt()));
        account.setAddressLine1(toBeMapped.getAddressLine1());
        account.setAddressLine2(toBeMapped.getAddressLine2());
        account.setAdminEmail(toBeMapped.getAdminEmail());
        account.setAdminFullName(toBeMapped.getAdminFullName());
        account.setAdminName(toBeMapped.getAdminName());
        account.setAdminPassword(toBeMapped.getAdminPassword());
        account.setAliases(toBeMapped.getAliases());
        account.setCity(toBeMapped.getCity());
        account.setCompany(toBeMapped.getCompany());
        account.setContact(toBeMapped.getContact());
        account.setContractNumber(toBeMapped.getContractNumber());
        account.setCountry(toBeMapped.getCountry());
        account.setCustomFields(toBeMapped.getCustomFields());
        account.setCustomerNumber(toBeMapped.getCustomerNumber());
        account.setDisplayName(toBeMapped.getDisplayName());
        account.setEmail(toBeMapped.getEmail());
        account.setEndMarket(toBeMapped.getEndMarket());
        account.setExpirationWarningThreshold(toBeMapped.getExpirationWarningThreshold());
        account.setId(toBeMapped.getId());
        account.setIdleTimeout(toBeMapped.getIdleTimeout());
        account.setMfaStatus(translateToAccountMfaStatus(toBeMapped.getMfaStatus()));
        account.setNotificationEmails(toBeMapped.getNotificationEmails());
        account.setPasswordPolicy(PasswordPolicyAdapter.map(toBeMapped.getPasswordPolicy()));
        account.setPasswordRecoveryExpiration(TranslationUtils.toInt(toBeMapped.getPasswordRecoveryExpiration()));
        account.setPhoneNumber(toBeMapped.getPhoneNumber());
        account.setPostalCode(toBeMapped.getPostalCode());
        account.setSalesContact(toBeMapped.getSalesContact());
        account.setState(toBeMapped.getState());
        return account;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<AccountInfo, Account> getMapper() {
        return new GenericAdapter.Mapper<AccountInfo, Account>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public Account map(AccountInfo toBeMapped) {
                return AccountAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps an account into an account creation req.
     * 
     * @param toBeMapped
     *            an account.
     * @return mapped an account creation req
     */
    @Internal
    public static AccountCreationReq reverseMapAddRequest(Account toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final AccountCreationReq accountCreationReq = new AccountCreationReq();
        accountCreationReq.setAddressLine1(toBeMapped.getAddressLine1());
        accountCreationReq.setAddressLine2(toBeMapped.getAddressLine2());
        accountCreationReq.setAdminEmail(toBeMapped.getAdminEmail());
        accountCreationReq.setAdminFullName(toBeMapped.getAdminFullName());
        accountCreationReq.setAdminName(toBeMapped.getAdminName());
        accountCreationReq.setAdminPassword(toBeMapped.getAdminPassword());
        accountCreationReq.setAliases(toBeMapped.getAliases());
        accountCreationReq.setCity(toBeMapped.getCity());
        accountCreationReq.setCompany(toBeMapped.getCompany());
        accountCreationReq.setContact(toBeMapped.getContact());
        accountCreationReq.setContractNumber(toBeMapped.getContractNumber());
        accountCreationReq.setCountry(toBeMapped.getCountry());
        accountCreationReq.setCustomerNumber(toBeMapped.getCustomerNumber());
        accountCreationReq.setDisplayName(toBeMapped.getDisplayName());
        accountCreationReq.setEmail(toBeMapped.getEmail());
        accountCreationReq.setEndMarket(toBeMapped.getEndMarket());
        accountCreationReq.setPhoneNumber(toBeMapped.getPhoneNumber());
        accountCreationReq.setPostalCode(toBeMapped.getPostalCode());
        accountCreationReq.setState(toBeMapped.getState());
        return accountCreationReq;
    }

    /**
     * Maps an account info list into an account.
     * 
     * @param toBeMapped
     *            an account info list.
     * @return mapped list response
     */
    @Internal
    public static ListResponse<Account> mapList(AccountInfoList toBeMapped) {
        final AccountInfoList finalList = toBeMapped;
        final GenericAdapter.RespList<AccountInfo> respList = new GenericAdapter.RespList<AccountInfo>() {
            /**
             * Executes getAfter.
             * 
             * @return something
             */
            @Override
            public String getAfter() {
                return (finalList == null) ? null : finalList.getAfter();
            }

            /**
             * Executes getContinuationMarker.
             * 
             * @return something
             */
            @Override
            public String getContinuationMarker() {
                return null;
            }

            /**
             * Executes getData.
             * 
             * @return something
             */
            @Override
            public List<AccountInfo> getData() {
                return (finalList == null) ? null : finalList.getData();
            }

            /**
             * Executes getHasMore.
             * 
             * @return something
             */
            @Override
            public Boolean getHasMore() {
                return (finalList == null) ? null : finalList.isHasMore();
            }

            /**
             * Executes getLimit.
             * 
             * @return something
             */
            @Override
            public Integer getLimit() {
                return (finalList == null) ? null : finalList.getLimit();
            }

            /**
             * Executes getOrder.
             * 
             * @return something
             */
            @Override
            public String getOrder() {
                return (finalList == null) ? null : finalList.getOrder().toString();
            }

            /**
             * Executes getTotalCount.
             * 
             * @return something
             */
            @Override
            public Integer getTotalCount() {
                return (finalList == null) ? null : finalList.getTotalCount();
            }
        };
        return GenericAdapter.mapList(respList, AccountAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<AccountInfoList, ListResponse<Account>> getListMapper() {
        return new GenericAdapter.Mapper<AccountInfoList, ListResponse<Account>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ListResponse<Account> map(AccountInfoList toBeMapped) {
                return AccountAdapter.mapList(toBeMapped);
            }
        };
    }

    /**
     * Maps an account into an account update root req.
     * 
     * @param toBeMapped
     *            an account.
     * @return mapped an account update root req
     */
    @Internal
    public static AccountUpdateRootReq reverseMapUpdateRequest(Account toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final AccountUpdateRootReq accountUpdateRootReq = new AccountUpdateRootReq();
        accountUpdateRootReq.setAddressLine1(toBeMapped.getAddressLine1());
        accountUpdateRootReq.setAddressLine2(toBeMapped.getAddressLine2());
        accountUpdateRootReq.setAliases(toBeMapped.getAliases());
        accountUpdateRootReq.setCity(toBeMapped.getCity());
        accountUpdateRootReq.setCompany(toBeMapped.getCompany());
        accountUpdateRootReq.setContact(toBeMapped.getContact());
        accountUpdateRootReq.setContractNumber(toBeMapped.getContractNumber());
        accountUpdateRootReq.setCountry(toBeMapped.getCountry());
        accountUpdateRootReq.setCustomFields(toBeMapped.getCustomFields());
        accountUpdateRootReq.setCustomerNumber(toBeMapped.getCustomerNumber());
        accountUpdateRootReq.setDisplayName(toBeMapped.getDisplayName());
        accountUpdateRootReq.setEmail(toBeMapped.getEmail());
        accountUpdateRootReq.setEndMarket(toBeMapped.getEndMarket());
        accountUpdateRootReq.setExpirationWarningThreshold(toBeMapped.getExpirationWarningThreshold());
        accountUpdateRootReq.setIdleTimeout(toBeMapped.getIdleTimeout());
        accountUpdateRootReq.setMfaStatus(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelAccountupdaterootreqMfastatusenum(toBeMapped.getMfaStatus()));
        accountUpdateRootReq.setNotificationEmails(toBeMapped.getNotificationEmails());
        accountUpdateRootReq.setPasswordPolicy(PasswordPolicyAdapter.reverseMapUpdateRequest(toBeMapped.getPasswordPolicy()));
        accountUpdateRootReq.setPasswordRecoveryExpiration(toBeMapped.getPasswordRecoveryExpiration());
        accountUpdateRootReq.setPhoneNumber(toBeMapped.getPhoneNumber());
        accountUpdateRootReq.setPostalCode(toBeMapped.getPostalCode());
        accountUpdateRootReq.setSalesContact(toBeMapped.getSalesContact());
        accountUpdateRootReq.setState(toBeMapped.getState());
        return accountUpdateRootReq;
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a mfa status enum.
     * @return mapped enum value
     */
    @Internal
    protected static AccountMfaStatus translateToAccountMfaStatus(AccountInfo.MfaStatusEnum toBeMapped) {
        if (toBeMapped == null) {
            return AccountMfaStatus.getUnknownEnum();
        }
        switch (toBeMapped) {
            case ENFORCED:
                return AccountMfaStatus.ENFORCED;
            case OPTIONAL:
                return AccountMfaStatus.OPTIONAL;
            default:
                return AccountMfaStatus.getUnknownEnum();
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a status enum.
     * @return mapped enum value
     */
    @Internal
    protected static AccountStatus translateToAccountStatus(AccountInfo.StatusEnum toBeMapped) {
        if (toBeMapped == null) {
            return AccountStatus.getUnknownEnum();
        }
        switch (toBeMapped) {
            case ENROLLING:
                return AccountStatus.ENROLLING;
            case ACTIVE:
                return AccountStatus.ACTIVE;
            case RESTRICTED:
                return AccountStatus.RESTRICTED;
            case SUSPENDED:
                return AccountStatus.SUSPENDED;
            default:
                return AccountStatus.getUnknownEnum();
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            an account mfa status.
     * @return mapped enum value
     */
    @Internal
    protected static AccountUpdateRootReq.MfaStatusEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelAccountupdaterootreqMfastatusenum(AccountMfaStatus toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case ENFORCED:
                return AccountUpdateRootReq.MfaStatusEnum.ENFORCED;
            case OPTIONAL:
                return AccountUpdateRootReq.MfaStatusEnum.OPTIONAL;
            default:
                return null;
        }
    }
}
