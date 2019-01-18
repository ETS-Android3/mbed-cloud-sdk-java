// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;
import java.util.List;

/**
 * Model for a subtenant user invitation.
 */
@Preamble(description = "Model for a subtenant user invitation.")
public class SubtenantUserInvitation implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 1700052454192122L;

    /**
     * The ID of the account the user is invited to.
     */
    @Required
    private String accountId;

    /**
     * Creation UTC time RFC3339.
     */
    private final Date createdAt;

    /**
     * Email address of the invited user.
     */
    @Required
    private String email;

    /**
     * Invitation expiration as UTC time RFC3339.
     */
    private final Date expiration;

    /**
     * The ID of the invitation.
     */
    private String id;

    /**
     * A list of login profiles for the user. Specified as the identity providers the user is associated with.
     */
    private List<LoginProfile> loginProfiles;

    /**
     * Last update UTC time RFC3339.
     */
    private final Date updatedAt;

    /**
     * The ID of the invited user.
     */
    private final String userId;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantUserInvitation()} instead.
     * 
     * @param accountId
     *            The ID of the account the user is invited to.
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param email
     *            Email address of the invited user.
     * @param expiration
     *            Invitation expiration as UTC time RFC3339.
     * @param id
     *            The ID of the invitation.
     * @param loginProfiles
     *            A list of login profiles for the user. Specified as the identity providers the user is associated
     *            with.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     * @param userId
     *            The ID of the invited user.
     */
    @Internal
    public SubtenantUserInvitation(String accountId, Date createdAt, String email, Date expiration, String id,
                                   List<LoginProfile> loginProfiles, Date updatedAt, String userId) {
        super();
        this.createdAt = createdAt;
        this.expiration = expiration;
        this.updatedAt = updatedAt;
        this.userId = userId;
        setAccountId(accountId);
        setEmail(email);
        setId(id);
        setLoginProfiles(loginProfiles);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantUserInvitation()} instead.
     * 
     * @param subtenantUserInvitation
     *            a subtenant user invitation.
     */
    @Internal
    public SubtenantUserInvitation(SubtenantUserInvitation subtenantUserInvitation) {
        this(subtenantUserInvitation == null ? (String) null : subtenantUserInvitation.accountId,
             subtenantUserInvitation == null ? new java.util.Date() : subtenantUserInvitation.createdAt,
             subtenantUserInvitation == null ? (String) null : subtenantUserInvitation.email,
             subtenantUserInvitation == null ? new java.util.Date() : subtenantUserInvitation.expiration,
             subtenantUserInvitation == null ? (String) null : subtenantUserInvitation.id,
             subtenantUserInvitation == null ? null : subtenantUserInvitation.loginProfiles,
             subtenantUserInvitation == null ? new java.util.Date() : subtenantUserInvitation.updatedAt,
             subtenantUserInvitation == null ? (String) null : subtenantUserInvitation.userId);
    }

    /**
     * Constructor.
     */
    public SubtenantUserInvitation() {
        this((String) null, new java.util.Date(), (String) null, new java.util.Date(), (String) null, null,
             new java.util.Date(), (String) null);
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The ID of the invitation.
     */
    public SubtenantUserInvitation(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #SubtenantUserInvitation()} instead.
     * 
     * @param createdAt
     *            Creation UTC time RFC3339.
     * @param expiration
     *            Invitation expiration as UTC time RFC3339.
     * @param updatedAt
     *            Last update UTC time RFC3339.
     * @param userId
     *            The ID of the invited user.
     */
    @Internal
    public SubtenantUserInvitation(Date createdAt, Date expiration, Date updatedAt, String userId) {
        this((String) null, createdAt, (String) null, expiration, (String) null, null, updatedAt, userId);
    }

    /**
     * Constructor.
     * 
     * @param accountId
     *            The ID of the account the user is invited to.
     * @param email
     *            Email address of the invited user.
     */
    public SubtenantUserInvitation(String accountId, String email) {
        this(accountId, new java.util.Date(), email, new java.util.Date(), (String) null, null, new java.util.Date(),
             (String) null);
    }

    /**
     * Gets the id of the account the user is invited to.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the id of the account the user is invited to.
     * 
     * @param accountId
     *            The ID of the account the user is invited to.
     */
    @Required
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Checks whether accountId value is valid.
     * 
     * @return true if the value is valid; false otherwise.
     */
    @SuppressWarnings("PMD.UselessParentheses")
    public boolean isAccountIdValid() {
        return accountId != null;
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
     * Gets email address of the invited user.
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email address of the invited user.
     * 
     * @param email
     *            Email address of the invited user.
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
     * Gets invitation expiration as utc time rfc3339.
     * 
     * @return expiration
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * Gets the id of the invitation.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the invitation.
     * 
     * @param id
     *            The ID of the invitation.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the id of the invitation.
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param subtenantUserInvitationId
     *            The ID of the invitation.
     */
    @Internal
    public void setSubtenantUserInvitationId(String subtenantUserInvitationId) {
        setId(subtenantUserInvitationId);
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
     * Gets last update utc time rfc3339.
     * 
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Gets the id of the invited user.
     * 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Calculates the hash code of this instance based on field values.
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
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((expiration == null) ? 0 : expiration.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((loginProfiles == null) ? 0 : loginProfiles.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

    /**
     * Method to ensure {@link #equals(Object)} is correct.
     * <p>
     * Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
     * 
     * @param other
     *            another object.
     * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
     */
    protected boolean canEqual(Object other) {
        return other instanceof SubtenantUserInvitation;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     *            an object to compare with this instance.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SubtenantUserInvitation)) {
            return false;
        }
        final SubtenantUserInvitation other = (SubtenantUserInvitation) obj;
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
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (expiration == null) {
            if (other.expiration != null) {
                return false;
            }
        } else if (!expiration.equals(other.expiration)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (loginProfiles == null) {
            if (other.loginProfiles != null) {
                return false;
            }
        } else if (!loginProfiles.equals(other.loginProfiles)) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
            return false;
        }
        if (userId == null) {
            if (other.userId != null) {
                return false;
            }
        } else if (!userId.equals(other.userId)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of the object.
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "SubtenantUserInvitation [accountId=" + accountId + ", createdAt=" + createdAt + ", email=" + email
               + ", expiration=" + expiration + ", id=" + id + ", loginProfiles=" + loginProfiles + ", updatedAt="
               + updatedAt + ", userId=" + userId + "]";
    }

    /**
     * Checks whether the model is valid or not.
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return isAccountIdValid() && isEmailValid();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public SubtenantUserInvitation clone() {
        return new SubtenantUserInvitation(this);
    }
}
