// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Model for a user.
 */
@Preamble(description = "Model for a user.")
@SuppressWarnings("PMD.CyclomaticComplexity")
public class User implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 2103476832119518L;

    /**
     * The ID of the account.
     */
    private final String accountId;

    /**
     * List of active user sessions.
     */
    private final List<ActiveSession> activeSessions;

    /**
     * Address.
     */
    private String address;

    /**
     * Creation UTC time RFC3339.
     */
    private final Date createdAt;

    /**
     * A timestamp of the user creation in the storage, in milliseconds.
     */
    private final long creationTime;

    /**
     * User's account specific custom properties. The value is a string.
     */
    private final Map<String, String> customFields;

    /**
     * The email address.
     */
    @Required
    private String email;

    /**
     * A flag indicating whether the user's email address has been verified or not.
     */
    private final boolean emailVerified;

    /**
     * The full name of the user.
     */
    private String fullName;

    /**
     * The ID of the user.
     */
    private String id;

    /**
     * A timestamp of the latest login of the user, in milliseconds.
     */
    private final long lastLoginTime;

    /**
     * Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user, with
     * timestamps in RFC3339 format.
     */
    private final List<LoginHistory> loginHistory;

    /**
     * A list of login profiles for the user. Specified as the identity providers the user is associated with.
     */
    private List<LoginProfile> loginProfiles;

    /**
     * A flag indicating that receiving marketing information has been accepted.
     */
    private boolean marketingAccepted;

    /**
     * The password when creating a new user. It will be generated when not present in the request.
     */
    private String password;

    /**
     * A timestamp of the latest change of the user password, in milliseconds.
     */
    private final long passwordChangedTime;

    /**
     * Phone number.
     */
    private String phoneNumber;

    /**
     * The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment process.
     * INVITED means that the user has not accepted the invitation request. RESET means that the password must be
     * changed immediately. INACTIVE users are locked out and not permitted to use the system.
     */
    private UserStatus status;

    /**
     * A flag indicating that the General Terms and Conditions has been accepted.
     */
    private boolean termsAccepted;

    /**
     * A list of scratch codes for the 2-factor authentication. Visible only when 2FA is requested to be enabled or the
     * codes regenerated.
     */
    private final List<String> totpScratchCodes;

    /**
     * A flag indicating whether 2-factor authentication (TOTP) has been enabled.
     */
    private boolean twoFactorAuthentication;

    /**
     * Last update UTC time RFC3339.
     */
    private final Date updatedAt;

    /**
     * A username containing alphanumerical letters and -,._@+= characters.
     */
    private String username;

    /**
     * Internal constructor.
     * 
     * <p>
     * Note: Should not be used. Use {@link #User()} instead.
     * 
     * @param accountId
     *            The ID of the account.
     * @param activeSessions
     *            List of active user sessions.
     * @param address
     *            Address.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param creationTime
     *            A timestamp of the user creation in the storage, in milliseconds.
     * @param customFields
     *            User's account specific custom properties. The value is a string.
     * @param email
     *            The email address.
     * @param emailVerified
     *            A flag indicating whether the user's email address has been verified or not.
     * @param fullName
     *            The full name of the user.
     * @param id
     *            The ID of the user.
     * @param lastLoginTime
     *            A timestamp of the latest login of the user, in milliseconds.
     * @param loginHistory
     *            Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user,
     *            with timestamps in RFC3339 format.
     * @param loginProfiles
     *            A list of login profiles for the user. Specified as the identity providers the user is associated
     *            with.
     * @param marketingAccepted
     *            A flag indicating that receiving marketing information has been accepted.
     * @param password
     *            The password when creating a new user. It will be generated when not present in the request.
     * @param passwordChangedTime
     *            A timestamp of the latest change of the user password, in milliseconds.
     * @param phoneNumber
     *            Phone number.
     * @param status
     *            The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment
     *            process. INVITED means that the user has not accepted the invitation request. RESET means that the
     *            password must be changed immediately. INACTIVE users are locked out and not permitted to use the
     *            system.
     * @param termsAccepted
     *            A flag indicating that the General Terms and Conditions has been accepted.
     * @param totpScratchCodes
     *            A list of scratch codes for the 2-factor authentication. Visible only when 2FA is requested to be
     *            enabled or the codes regenerated.
     * @param twoFactorAuthentication
     *            A flag indicating whether 2-factor authentication (TOTP) has been enabled.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     * @param username
     *            A username containing alphanumerical letters and -,._@+= characters.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public User(String accountId, List<ActiveSession> activeSessions, String address, Date createdAt, long creationTime,
                Map<String, String> customFields, String email, boolean emailVerified, String fullName, String id,
                long lastLoginTime, List<LoginHistory> loginHistory, List<LoginProfile> loginProfiles,
                boolean marketingAccepted, String password, long passwordChangedTime, String phoneNumber,
                UserStatus status, boolean termsAccepted, List<String> totpScratchCodes,
                boolean twoFactorAuthentication, Date updatedAt, String username) {
        super();
        this.accountId = accountId;
        this.activeSessions = activeSessions;
        this.createdAt = createdAt;
        this.creationTime = creationTime;
        this.customFields = customFields;
        this.emailVerified = emailVerified;
        this.lastLoginTime = lastLoginTime;
        this.loginHistory = loginHistory;
        this.passwordChangedTime = passwordChangedTime;
        this.totpScratchCodes = totpScratchCodes;
        this.updatedAt = updatedAt;
        setAddress(address);
        setEmail(email);
        setFullName(fullName);
        setId(id);
        setLoginProfiles(loginProfiles);
        setMarketingAccepted(marketingAccepted);
        setPassword(password);
        setPhoneNumber(phoneNumber);
        setStatus(status);
        setTermsAccepted(termsAccepted);
        setTwoFactorAuthentication(twoFactorAuthentication);
        setUsername(username);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Note: Should not be used. Use {@link #User()} instead.
     * 
     * @param user
     *            a user.
     */
    @Internal
    public User(User user) {
        this(user == null ? (String) null : user.accountId,
             user == null ? (java.util.List<com.arm.mbed.cloud.sdk.accounts.model.ActiveSession>) null
                          : user.activeSessions,
             user == null ? (String) null : user.address, user == null ? new java.util.Date() : user.createdAt,
             user == null ? 0L : user.creationTime,
             user == null ? (java.util.Map<String, String>) null : user.customFields,
             user == null ? (String) null : user.email, user != null && user.emailVerified,
             user == null ? (String) null : user.fullName, user == null ? (String) null : user.id,
             user == null ? 0L : user.lastLoginTime,
             user == null ? (java.util.List<com.arm.mbed.cloud.sdk.accounts.model.LoginHistory>) null
                          : user.loginHistory,
             user == null ? (java.util.List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile>) null
                          : user.loginProfiles,
             user != null && user.marketingAccepted, user == null ? (String) null : user.password,
             user == null ? 0L : user.passwordChangedTime, user == null ? (String) null : user.phoneNumber,
             user == null ? UserStatus.getDefault() : user.status, user != null && user.termsAccepted,
             user == null ? (java.util.List<String>) null : user.totpScratchCodes,
             user != null && user.twoFactorAuthentication, user == null ? new java.util.Date() : user.updatedAt,
             user == null ? (String) null : user.username);
    }

    /**
     * Constructor.
     */
    public User() {
        this((String) null, (java.util.List<com.arm.mbed.cloud.sdk.accounts.model.ActiveSession>) null, (String) null,
             new java.util.Date(), 0L, (java.util.Map<String, String>) null, (String) null, false, (String) null,
             (String) null, 0L, (java.util.List<com.arm.mbed.cloud.sdk.accounts.model.LoginHistory>) null,
             (java.util.List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile>) null, false, (String) null, 0L,
             (String) null, UserStatus.getDefault(), false, (java.util.List<String>) null, false, new java.util.Date(),
             (String) null);
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The ID of the user.
     */
    public User(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Note: Should not be used. Use {@link #User()} instead.
     * 
     * @param accountId
     *            The ID of the account.
     * @param activeSessions
     *            List of active user sessions.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param creationTime
     *            A timestamp of the user creation in the storage, in milliseconds.
     * @param customFields
     *            User's account specific custom properties. The value is a string.
     * @param emailVerified
     *            A flag indicating whether the user's email address has been verified or not.
     * @param lastLoginTime
     *            A timestamp of the latest login of the user, in milliseconds.
     * @param loginHistory
     *            Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user,
     *            with timestamps in RFC3339 format.
     * @param passwordChangedTime
     *            A timestamp of the latest change of the user password, in milliseconds.
     * @param totpScratchCodes
     *            A list of scratch codes for the 2-factor authentication. Visible only when 2FA is requested to be
     *            enabled or the codes regenerated.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    public User(String accountId, List<ActiveSession> activeSessions, Date createdAt, long creationTime,
                Map<String, String> customFields, boolean emailVerified, long lastLoginTime,
                List<LoginHistory> loginHistory, long passwordChangedTime, List<String> totpScratchCodes,
                Date updatedAt) {
        this(accountId, activeSessions, (String) null, createdAt, creationTime, customFields, (String) null,
             emailVerified, (String) null, (String) null, lastLoginTime, loginHistory,
             (java.util.List<com.arm.mbed.cloud.sdk.accounts.model.LoginProfile>) null, false, (String) null,
             passwordChangedTime, (String) null, UserStatus.getDefault(), false, totpScratchCodes, false, updatedAt,
             (String) null);
    }

    /**
     * Gets the id of the account.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Gets list of active user sessions.
     * 
     * @return activeSessions
     */
    public List<ActiveSession> getActiveSessions() {
        return activeSessions;
    }

    /**
     * Gets address.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     * 
     * @param address
     *            Address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets creation utc time rfc3339.
     * 
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Gets a timestamp of the user creation in the storage, in milliseconds.
     * 
     * @return creationTime
     */
    public long getCreationTime() {
        return creationTime;
    }

    /**
     * Gets user's account specific custom properties. the value is a string.
     * 
     * @return customFields
     */
    public Map<String, String> getCustomFields() {
        return customFields;
    }

    /**
     * Gets the email address.
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address.
     * 
     * @param email
     *            The email address.
     */
    @Required
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Checks whether email value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isEmailValid() {
        return email != null;
    }

    /**
     * Gets a flag indicating whether the user's email address has been verified or not.
     * 
     * @return emailVerified
     */
    public boolean isEmailVerified() {
        return emailVerified;
    }

    /**
     * Gets the full name of the user.
     * 
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name of the user.
     * 
     * @param fullName
     *            The full name of the user.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the id of the user.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the user.
     * 
     * @param id
     *            The ID of the user.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the id of the user.
     * 
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param userId
     *            The ID of the user.
     */
    @Internal
    public void setUserId(String userId) {
        setId(userId);
    }

    /**
     * Gets a timestamp of the latest login of the user, in milliseconds.
     * 
     * @return lastLoginTime
     */
    public long getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Gets timestamps, succeedings, ip addresses and user agent information of the last five logins of the user, with
     * timestamps in rfc3339 format.
     * 
     * @return loginHistory
     */
    public List<LoginHistory> getLoginHistory() {
        return loginHistory;
    }

    /**
     * Gets a list of login profiles for the user. specified as the identity providers the user is associated with.
     * 
     * @return loginProfiles
     */
    public List<LoginProfile> getLoginProfiles() {
        return loginProfiles;
    }

    /**
     * Sets a list of login profiles for the user. specified as the identity providers the user is associated with.
     * 
     * @param loginProfiles
     *            A list of login profiles for the user. Specified as the identity providers the user is associated
     *            with.
     */
    public void setLoginProfiles(List<LoginProfile> loginProfiles) {
        this.loginProfiles = loginProfiles;
    }

    /**
     * Gets a flag indicating that receiving marketing information has been accepted.
     * 
     * @return marketingAccepted
     */
    public boolean isMarketingAccepted() {
        return marketingAccepted;
    }

    /**
     * Sets a flag indicating that receiving marketing information has been accepted.
     * 
     * @param marketingAccepted
     *            A flag indicating that receiving marketing information has been accepted.
     */
    public void setMarketingAccepted(boolean marketingAccepted) {
        this.marketingAccepted = marketingAccepted;
    }

    /**
     * Gets the password when creating a new user. it will be generated when not present in the request.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password when creating a new user. it will be generated when not present in the request.
     * 
     * @param password
     *            The password when creating a new user. It will be generated when not present in the request.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets a timestamp of the latest change of the user password, in milliseconds.
     * 
     * @return passwordChangedTime
     */
    public long getPasswordChangedTime() {
        return passwordChangedTime;
    }

    /**
     * Gets phone number.
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number.
     * 
     * @param phoneNumber
     *            Phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the status of the user. enrolling state indicates that the user is in the middle of the enrollment process.
     * invited means that the user has not accepted the invitation request. reset means that the password must be
     * changed immediately. inactive users are locked out and not permitted to use the system.
     * 
     * @return status
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * Sets the status of the user. enrolling state indicates that the user is in the middle of the enrollment process.
     * invited means that the user has not accepted the invitation request. reset means that the password must be
     * changed immediately. inactive users are locked out and not permitted to use the system.
     * 
     * @param status
     *            The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment
     *            process. INVITED means that the user has not accepted the invitation request. RESET means that the
     *            password must be changed immediately. INACTIVE users are locked out and not permitted to use the
     *            system.
     */
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    /**
     * Gets a flag indicating that the general terms and conditions has been accepted.
     * 
     * @return termsAccepted
     */
    public boolean isTermsAccepted() {
        return termsAccepted;
    }

    /**
     * Sets a flag indicating that the general terms and conditions has been accepted.
     * 
     * @param termsAccepted
     *            A flag indicating that the General Terms and Conditions has been accepted.
     */
    public void setTermsAccepted(boolean termsAccepted) {
        this.termsAccepted = termsAccepted;
    }

    /**
     * Gets a list of scratch codes for the 2-factor authentication. visible only when 2fa is requested to be enabled or
     * the codes regenerated.
     * 
     * @return totpScratchCodes
     */
    public List<String> getTotpScratchCodes() {
        return totpScratchCodes;
    }

    /**
     * Gets a flag indicating whether 2-factor authentication (totp) has been enabled.
     * 
     * @return twoFactorAuthentication
     */
    public boolean isTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }

    /**
     * Sets a flag indicating whether 2-factor authentication (totp) has been enabled.
     * 
     * @param twoFactorAuthentication
     *            A flag indicating whether 2-factor authentication (TOTP) has been enabled.
     */
    public void setTwoFactorAuthentication(boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    /**
     * Gets last update utc time rfc3339.
     * 
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Gets a username containing alphanumerical letters and -,._@+= characters.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets a username containing alphanumerical letters and -,._@+= characters.
     * 
     * @param username
     *            A username containing alphanumerical letters and -,._@+= characters.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Calculates the hash code of this instance based on field values.
     * 
     * <p>
     * 
     * @see java.lang.Object#hashCode()
     * @return hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
        result = prime * result + ((activeSessions == null) ? 0 : activeSessions.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + Objects.hashCode(creationTime);
        result = prime * result + ((customFields == null) ? 0 : customFields.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + Objects.hashCode(emailVerified);
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + Objects.hashCode(lastLoginTime);
        result = prime * result + ((loginHistory == null) ? 0 : loginHistory.hashCode());
        result = prime * result + ((loginProfiles == null) ? 0 : loginProfiles.hashCode());
        result = prime * result + Objects.hashCode(marketingAccepted);
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + Objects.hashCode(passwordChangedTime);
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + Objects.hashCode(termsAccepted);
        result = prime * result + ((totpScratchCodes == null) ? 0 : totpScratchCodes.hashCode());
        result = prime * result + Objects.hashCode(twoFactorAuthentication);
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    /**
     * Method to ensure {@link #equals(Object)} is correct.
     * 
     * <p>
     * Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
     * 
     * @param other
     *            another object.
     * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
     */
    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * 
     * <p>
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     *            an object to compare with this instance.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    @SuppressWarnings({ "PMD.ExcessiveMethodLength", "PMD.NcssMethodCount" })
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        final User other = (User) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (accountId == null) {
            if (other.accountId != null) {
                return false;
            }
        } else if (!accountId.equals(other.accountId)) {
            return false;
        }
        if (activeSessions == null) {
            if (other.activeSessions != null) {
                return false;
            }
        } else if (!activeSessions.equals(other.activeSessions)) {
            return false;
        }
        if (address == null) {
            if (other.address != null) {
                return false;
            }
        } else if (!address.equals(other.address)) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (creationTime != other.creationTime) {
            return false;
        }
        if (customFields == null) {
            if (other.customFields != null) {
                return false;
            }
        } else if (!customFields.equals(other.customFields)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (emailVerified != other.emailVerified) {
            return false;
        }
        if (fullName == null) {
            if (other.fullName != null) {
                return false;
            }
        } else if (!fullName.equals(other.fullName)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (lastLoginTime != other.lastLoginTime) {
            return false;
        }
        if (loginHistory == null) {
            if (other.loginHistory != null) {
                return false;
            }
        } else if (!loginHistory.equals(other.loginHistory)) {
            return false;
        }
        if (loginProfiles == null) {
            if (other.loginProfiles != null) {
                return false;
            }
        } else if (!loginProfiles.equals(other.loginProfiles)) {
            return false;
        }
        if (marketingAccepted != other.marketingAccepted) {
            return false;
        }
        if (password == null) {
            if (other.password != null) {
                return false;
            }
        } else if (!password.equals(other.password)) {
            return false;
        }
        if (passwordChangedTime != other.passwordChangedTime) {
            return false;
        }
        if (phoneNumber == null) {
            if (other.phoneNumber != null) {
                return false;
            }
        } else if (!phoneNumber.equals(other.phoneNumber)) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        if (termsAccepted != other.termsAccepted) {
            return false;
        }
        if (totpScratchCodes == null) {
            if (other.totpScratchCodes != null) {
                return false;
            }
        } else if (!totpScratchCodes.equals(other.totpScratchCodes)) {
            return false;
        }
        if (twoFactorAuthentication != other.twoFactorAuthentication) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
            return false;
        }
        if (username == null) {
            if (other.username != null) {
                return false;
            }
        } else if (!username.equals(other.username)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of the object.
     * 
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "User [accountId=" + accountId + ", activeSessions=" + activeSessions + ", address=" + address
               + ", createdAt=" + createdAt + ", creationTime=" + creationTime + ", customFields=" + customFields
               + ", email=" + email + ", emailVerified=" + emailVerified + ", fullName=" + fullName + ", id=" + id
               + ", lastLoginTime=" + lastLoginTime + ", loginHistory=" + loginHistory + ", loginProfiles="
               + loginProfiles + ", marketingAccepted=" + marketingAccepted + ", password=" + password
               + ", passwordChangedTime=" + passwordChangedTime + ", phoneNumber=" + phoneNumber + ", status=" + status
               + ", termsAccepted=" + termsAccepted + ", totpScratchCodes=" + totpScratchCodes
               + ", twoFactorAuthentication=" + twoFactorAuthentication + ", updatedAt=" + updatedAt + ", username="
               + username + "]";
    }

    /**
     * Checks whether the model is valid or not.
     * 
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return isEmailValid();
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
    public User clone() {
        return new User(this);
    }
}
