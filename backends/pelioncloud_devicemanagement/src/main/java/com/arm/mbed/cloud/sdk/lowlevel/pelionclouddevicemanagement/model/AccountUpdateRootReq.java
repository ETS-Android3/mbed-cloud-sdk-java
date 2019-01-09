/*
 * Mbed Cloud API
 * The full Mbed Cloud API
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * This object represents an account update request.
 */
@ApiModel(description = "This object represents an account update request.")

public class AccountUpdateRootReq implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("address_line1")
    private String addressLine1 = null;

    @SerializedName("address_line2")
    private String addressLine2 = null;

    @SerializedName("aliases")
    private List<String> aliases = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("company")
    private String company = null;

    @SerializedName("contact")
    private String contact = null;

    @SerializedName("contract_number")
    private String contractNumber = null;

    @SerializedName("country")
    private String country = null;

    @SerializedName("custom_fields")
    private Map<String, String> customFields = null;

    @SerializedName("customer_number")
    private String customerNumber = null;

    @SerializedName("display_name")
    private String displayName = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("end_market")
    private String endMarket = null;

    @SerializedName("expiration_warning_threshold")
    private String expirationWarningThreshold = null;

    @SerializedName("idle_timeout")
    private String idleTimeout = null;

    /**
     * The enforcement status of setting up the multi-factor authentication. &#39;Enforced&#39; means that setting up
     * the MFA is required after login. &#39;Optional&#39; means that the MFA is not required.
     */
    @JsonAdapter(MfaStatusEnum.Adapter.class)
    public enum MfaStatusEnum {
        ENFORCED("enforced"),

        OPTIONAL("optional");

        private String value;

        MfaStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MfaStatusEnum fromValue(String text) {
            for (MfaStatusEnum b : MfaStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<MfaStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MfaStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MfaStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MfaStatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("mfa_status")
    private MfaStatusEnum mfaStatus = null;

    @SerializedName("notification_emails")
    private List<String> notificationEmails = null;

    @SerializedName("password_policy")
    private PasswordPolicy passwordPolicy = null;

    @SerializedName("phone_number")
    private String phoneNumber = null;

    @SerializedName("postal_code")
    private String postalCode = null;

    @SerializedName("sales_contact")
    private String salesContact = null;

    @SerializedName("state")
    private String state = null;

    public AccountUpdateRootReq addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Postal address line 1, not longer than 100 characters. Required for commercial accounts only.
     * 
     * @return addressLine1
     **/
    @ApiModelProperty(example = "110 Fulbourn Rd",
                      value = "Postal address line 1, not longer than 100 characters. Required for commercial accounts only.")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public AccountUpdateRootReq addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Postal address line 2, not longer than 100 characters.
     * 
     * @return addressLine2
     **/
    @ApiModelProperty(example = " ", value = "Postal address line 2, not longer than 100 characters.")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public AccountUpdateRootReq aliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public AccountUpdateRootReq addAliasesItem(String aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<String>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    /**
     * An array of aliases, not more than 10. An alias is not shorter than 8 and not longer than 100 characters.
     * 
     * @return aliases
     **/
    @ApiModelProperty(value = "An array of aliases, not more than 10. An alias is not shorter than 8 and not longer than 100 characters.")
    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public AccountUpdateRootReq city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city part of the postal address, not longer than 100 characters. Required for commercial accounts only.
     * 
     * @return city
     **/
    @ApiModelProperty(example = "Cambridge",
                      value = "The city part of the postal address, not longer than 100 characters. Required for commercial accounts only.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AccountUpdateRootReq company(String company) {
        this.company = company;
        return this;
    }

    /**
     * The name of the company, not longer than 100 characters. Required for commercial accounts only.
     * 
     * @return company
     **/
    @ApiModelProperty(example = "ARM Holdings Plc",
                      value = "The name of the company, not longer than 100 characters. Required for commercial accounts only.")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public AccountUpdateRootReq contact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * The name of the contact person for this account, not longer than 100 characters. Required for commercial accounts
     * only.
     * 
     * @return contact
     **/
    @ApiModelProperty(example = "J. Doe",
                      value = "The name of the contact person for this account, not longer than 100 characters. Required for commercial accounts only.")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public AccountUpdateRootReq contractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Contract number of the customer.
     * 
     * @return contractNumber
     **/
    @ApiModelProperty(value = "Contract number of the customer.")
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public AccountUpdateRootReq country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The country part of the postal address, not longer than 100 characters. Required for commercial accounts only.
     * 
     * @return country
     **/
    @ApiModelProperty(example = "United Kingdom",
                      value = "The country part of the postal address, not longer than 100 characters. Required for commercial accounts only.")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AccountUpdateRootReq customFields(Map<String, String> customFields) {
        this.customFields = customFields;
        return this;
    }

    public AccountUpdateRootReq putCustomFieldsItem(String key, String customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new HashMap<String, String>();
        }
        this.customFields.put(key, customFieldsItem);
        return this;
    }

    /**
     * Account&#39;s custom properties as key-value pairs, with a maximum of 10 keys. The maximum length of a key is 100
     * characters. The values are handled as strings and the maximum length for a value is 1000 characters.
     * 
     * @return customFields
     **/
    @ApiModelProperty(value = "Account's custom properties as key-value pairs, with a maximum of 10 keys. The maximum length of a key is 100 characters. The values are handled as strings and the maximum length for a value is 1000 characters.")
    public Map<String, String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, String> customFields) {
        this.customFields = customFields;
    }

    public AccountUpdateRootReq customerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     * Customer number of the customer.
     * 
     * @return customerNumber
     **/
    @ApiModelProperty(value = "Customer number of the customer.")
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public AccountUpdateRootReq displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The display name for the account, not longer than 100 characters.
     * 
     * @return displayName
     **/
    @ApiModelProperty(example = "ARM", value = "The display name for the account, not longer than 100 characters.")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AccountUpdateRootReq email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The company email address for this account, not longer than 254 characters. Required for commercial accounts
     * only.
     * 
     * @return email
     **/
    @ApiModelProperty(example = "info@arm.com",
                      value = "The company email address for this account, not longer than 254 characters. Required for commercial accounts only.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccountUpdateRootReq endMarket(String endMarket) {
        this.endMarket = endMarket;
        return this;
    }

    /**
     * The end market for this account, not longer than 100 characters.
     * 
     * @return endMarket
     **/
    @ApiModelProperty(example = "IT", value = "The end market for this account, not longer than 100 characters.")
    public String getEndMarket() {
        return endMarket;
    }

    public void setEndMarket(String endMarket) {
        this.endMarket = endMarket;
    }

    public AccountUpdateRootReq expirationWarningThreshold(String expirationWarningThreshold) {
        this.expirationWarningThreshold = expirationWarningThreshold;
        return this;
    }

    /**
     * Indicates how many days before account expiration a notification email should be sent. Valid values are: 1-180.
     * 
     * @return expirationWarningThreshold
     **/
    @ApiModelProperty(value = "Indicates how many days before account expiration a notification email should be sent. Valid values are: 1-180.")
    public String getExpirationWarningThreshold() {
        return expirationWarningThreshold;
    }

    public void setExpirationWarningThreshold(String expirationWarningThreshold) {
        this.expirationWarningThreshold = expirationWarningThreshold;
    }

    public AccountUpdateRootReq idleTimeout(String idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }

    /**
     * The reference token expiration time in minutes for this account. Between 1 and 120 minutes.
     * 
     * @return idleTimeout
     **/
    @ApiModelProperty(value = "The reference token expiration time in minutes for this account. Between 1 and 120 minutes.")
    public String getIdleTimeout() {
        return idleTimeout;
    }

    public void setIdleTimeout(String idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public AccountUpdateRootReq mfaStatus(MfaStatusEnum mfaStatus) {
        this.mfaStatus = mfaStatus;
        return this;
    }

    /**
     * The enforcement status of setting up the multi-factor authentication. &#39;Enforced&#39; means that setting up
     * the MFA is required after login. &#39;Optional&#39; means that the MFA is not required.
     * 
     * @return mfaStatus
     **/
    @ApiModelProperty(value = "The enforcement status of setting up the multi-factor authentication. 'Enforced' means that setting up the MFA is required after login. 'Optional' means that the MFA is not required.")
    public MfaStatusEnum getMfaStatus() {
        return mfaStatus;
    }

    public void setMfaStatus(MfaStatusEnum mfaStatus) {
        this.mfaStatus = mfaStatus;
    }

    public AccountUpdateRootReq notificationEmails(List<String> notificationEmails) {
        this.notificationEmails = notificationEmails;
        return this;
    }

    public AccountUpdateRootReq addNotificationEmailsItem(String notificationEmailsItem) {
        if (this.notificationEmails == null) {
            this.notificationEmails = new ArrayList<String>();
        }
        this.notificationEmails.add(notificationEmailsItem);
        return this;
    }

    /**
     * A list of notification email addresses.
     * 
     * @return notificationEmails
     **/
    @ApiModelProperty(value = "A list of notification email addresses.")
    public List<String> getNotificationEmails() {
        return notificationEmails;
    }

    public void setNotificationEmails(List<String> notificationEmails) {
        this.notificationEmails = notificationEmails;
    }

    public AccountUpdateRootReq passwordPolicy(PasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }

    /**
     * Password policy for this account.
     * 
     * @return passwordPolicy
     **/
    @ApiModelProperty(value = "Password policy for this account.")
    public PasswordPolicy getPasswordPolicy() {
        return passwordPolicy;
    }

    public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    public AccountUpdateRootReq phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The phone number of a representative of the company, not longer than 100 characters.
     * 
     * @return phoneNumber
     **/
    @ApiModelProperty(example = "+44 (1223) 400 400",
                      value = "The phone number of a representative of the company, not longer than 100 characters.")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AccountUpdateRootReq postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The postal code part of the postal address, not longer than 100 characters.
     * 
     * @return postalCode
     **/
    @ApiModelProperty(example = "CB1 9NJ",
                      value = "The postal code part of the postal address, not longer than 100 characters.")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public AccountUpdateRootReq salesContact(String salesContact) {
        this.salesContact = salesContact;
        return this;
    }

    /**
     * Email address of the sales contact.
     * 
     * @return salesContact
     **/
    @ApiModelProperty(value = "Email address of the sales contact.")
    public String getSalesContact() {
        return salesContact;
    }

    public void setSalesContact(String salesContact) {
        this.salesContact = salesContact;
    }

    public AccountUpdateRootReq state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state part of the postal address, not longer than 100 characters.
     * 
     * @return state
     **/
    @ApiModelProperty(example = " ", value = "The state part of the postal address, not longer than 100 characters.")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountUpdateRootReq accountUpdateRootReq = (AccountUpdateRootReq) o;
        return Objects.equals(this.addressLine1, accountUpdateRootReq.addressLine1)
               && Objects.equals(this.addressLine2, accountUpdateRootReq.addressLine2)
               && Objects.equals(this.aliases, accountUpdateRootReq.aliases)
               && Objects.equals(this.city, accountUpdateRootReq.city)
               && Objects.equals(this.company, accountUpdateRootReq.company)
               && Objects.equals(this.contact, accountUpdateRootReq.contact)
               && Objects.equals(this.contractNumber, accountUpdateRootReq.contractNumber)
               && Objects.equals(this.country, accountUpdateRootReq.country)
               && Objects.equals(this.customFields, accountUpdateRootReq.customFields)
               && Objects.equals(this.customerNumber, accountUpdateRootReq.customerNumber)
               && Objects.equals(this.displayName, accountUpdateRootReq.displayName)
               && Objects.equals(this.email, accountUpdateRootReq.email)
               && Objects.equals(this.endMarket, accountUpdateRootReq.endMarket)
               && Objects.equals(this.expirationWarningThreshold, accountUpdateRootReq.expirationWarningThreshold)
               && Objects.equals(this.idleTimeout, accountUpdateRootReq.idleTimeout)
               && Objects.equals(this.mfaStatus, accountUpdateRootReq.mfaStatus)
               && Objects.equals(this.notificationEmails, accountUpdateRootReq.notificationEmails)
               && Objects.equals(this.passwordPolicy, accountUpdateRootReq.passwordPolicy)
               && Objects.equals(this.phoneNumber, accountUpdateRootReq.phoneNumber)
               && Objects.equals(this.postalCode, accountUpdateRootReq.postalCode)
               && Objects.equals(this.salesContact, accountUpdateRootReq.salesContact)
               && Objects.equals(this.state, accountUpdateRootReq.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, aliases, city, company, contact, contractNumber, country,
                            customFields, customerNumber, displayName, email, endMarket, expirationWarningThreshold,
                            idleTimeout, mfaStatus, notificationEmails, passwordPolicy, phoneNumber, postalCode,
                            salesContact, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountUpdateRootReq {\n");

        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    endMarket: ").append(toIndentedString(endMarket)).append("\n");
        sb.append("    expirationWarningThreshold: ").append(toIndentedString(expirationWarningThreshold)).append("\n");
        sb.append("    idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
        sb.append("    mfaStatus: ").append(toIndentedString(mfaStatus)).append("\n");
        sb.append("    notificationEmails: ").append(toIndentedString(notificationEmails)).append("\n");
        sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    salesContact: ").append(toIndentedString(salesContact)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
