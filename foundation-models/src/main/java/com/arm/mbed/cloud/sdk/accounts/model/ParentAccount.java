// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;

/**
 * Model for a parent account.
 */
@Preamble(description = "Model for a parent account.")
public class ParentAccount implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 3177422671611851L;

    /**
     * The email address of the admin user who is the contact person of the parent account.
     */
    private final String adminEmail;

    /**
     * The name of the admin user who is the contact person of the parent account.
     */
    private final String adminName;

    /**
     * The ID of the parent account.
     */
    private String id;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ParentAccount()} instead.
     * 
     * @param adminEmail
     *            The email address of the admin user who is the contact person of the parent account.
     * @param adminName
     *            The name of the admin user who is the contact person of the parent account.
     * @param id
     *            The ID of the parent account.
     */
    @Internal
    public ParentAccount(String adminEmail, String adminName, String id) {
        super();
        this.adminEmail = adminEmail;
        this.adminName = adminName;
        setId(id);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ParentAccount()} instead.
     * 
     * @param parentAccount
     *            a parent account.
     */
    @Internal
    public ParentAccount(ParentAccount parentAccount) {
        this(parentAccount == null ? (String) null : parentAccount.adminEmail,
             parentAccount == null ? (String) null : parentAccount.adminName,
             parentAccount == null ? (String) null : parentAccount.id);
    }

    /**
     * Constructor.
     */
    public ParentAccount() {
        this((String) null, (String) null, (String) null);
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The ID of the parent account.
     */
    public ParentAccount(String id) {
        this();
        setId(id);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #ParentAccount()} instead.
     * 
     * @param adminEmail
     *            The email address of the admin user who is the contact person of the parent account.
     * @param adminName
     *            The name of the admin user who is the contact person of the parent account.
     */
    @Internal
    public ParentAccount(String adminEmail, String adminName) {
        this(adminEmail, adminName, (String) null);
    }

    /**
     * Gets the email address of the admin user who is the contact person of the parent account.
     * 
     * @return adminEmail
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * Gets the name of the admin user who is the contact person of the parent account.
     * 
     * @return adminName
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * Gets the id of the parent account.
     * 
     * @return id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the parent account.
     * 
     * @param id
     *            The ID of the parent account.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the id of the parent account.
     * <p>
     * Similar to {@link #setId(String)}
     * 
     * @param parentAccountId
     *            The ID of the parent account.
     */
    @Internal
    public void setParentAccountId(String parentAccountId) {
        setId(parentAccountId);
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
        result = prime * result + ((adminEmail == null) ? 0 : adminEmail.hashCode());
        result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        return other instanceof ParentAccount;
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
        if (!(obj instanceof ParentAccount)) {
            return false;
        }
        final ParentAccount other = (ParentAccount) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (adminEmail == null) {
            if (other.adminEmail != null) {
                return false;
            }
        } else if (!adminEmail.equals(other.adminEmail)) {
            return false;
        }
        if (adminName == null) {
            if (other.adminName != null) {
                return false;
            }
        } else if (!adminName.equals(other.adminName)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
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
        return "ParentAccount [adminEmail=" + adminEmail + ", adminName=" + adminName + ", id=" + id + "]";
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
        return true;
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public ParentAccount clone() {
        return new ParentAccount(this);
    }
}
