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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * This object represents an account creation request.
 */
@ApiModel(description = "This object represents an account creation request.")

public class AccountCreationReq implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("address_line1")
    private String addressLine1 = null;

    @SerializedName("address_line2")
    private String addressLine2 = null;

    @SerializedName("admin_email")
    private String adminEmail = null;

    @SerializedName("admin_full_name")
    private String adminFullName = null;

    @SerializedName("admin_name")
    private String adminName = null;

    @SerializedName("admin_password")
    private String adminPassword = null;

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

    @SerializedName("customer_number")
    private String customerNumber = null;

    @SerializedName("display_name")
    private String displayName = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("end_market")
    private String endMarket = null;

    @SerializedName("phone_number")
    private String phoneNumber = null;

    @SerializedName("postal_code")
    private String postalCode = null;

    @SerializedName("state")
    private String state = null;

    public AccountCreationReq addressLine1(String addressLine1) {
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

    public AccountCreationReq addressLine2(String addressLine2) {
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

    public AccountCreationReq adminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
        return this;
    }

    /**
     * The email address of the account admin, not longer than 254 characters.
     * 
     * @return adminEmail
     **/
    @ApiModelProperty(example = "admin@arm.com",
                      value = "The email address of the account admin, not longer than 254 characters.")
    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public AccountCreationReq adminFullName(String adminFullName) {
        this.adminFullName = adminFullName;
        return this;
    }

    /**
     * The full name of the admin user to be created.
     * 
     * @return adminFullName
     **/
    @ApiModelProperty(example = "Admin Doe", value = "The full name of the admin user to be created.")
    public String getAdminFullName() {
        return adminFullName;
    }

    public void setAdminFullName(String adminFullName) {
        this.adminFullName = adminFullName;
    }

    public AccountCreationReq adminName(String adminName) {
        this.adminName = adminName;
        return this;
    }

    /**
     * The username of the admin user to be created, containing alphanumerical letters and -,._@+&#x3D; characters. It
     * must be at least 4 but not more than 30 character long.
     * 
     * @return adminName
     **/
    @ApiModelProperty(example = "admin",
                      value = "The username of the admin user to be created, containing alphanumerical letters and -,._@+= characters. It must be at least 4 but not more than 30 character long.")
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public AccountCreationReq adminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * The password when creating a new user. It will be generated when not present in the request.
     * 
     * @return adminPassword
     **/
    @ApiModelProperty(example = "PZf9eEUH43DAPE9ULINFeuj",
                      value = "The password when creating a new user. It will be generated when not present in the request.")
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public AccountCreationReq aliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public AccountCreationReq addAliasesItem(String aliasesItem) {
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

    public AccountCreationReq city(String city) {
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

    public AccountCreationReq company(String company) {
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

    public AccountCreationReq contact(String contact) {
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

    public AccountCreationReq contractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Contract number of the customer.
     * 
     * @return contractNumber
     **/
    @ApiModelProperty(example = "1NX25_0001", value = "Contract number of the customer.")
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public AccountCreationReq country(String country) {
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

    public AccountCreationReq customerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     * Customer number of the customer.
     * 
     * @return customerNumber
     **/
    @ApiModelProperty(example = "1NC25_0001", value = "Customer number of the customer.")
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public AccountCreationReq displayName(String displayName) {
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

    public AccountCreationReq email(String email) {
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

    public AccountCreationReq endMarket(String endMarket) {
        this.endMarket = endMarket;
        return this;
    }

    /**
     * The end market of the account to be created.
     * 
     * @return endMarket
     **/
    @ApiModelProperty(example = "IT", required = true, value = "The end market of the account to be created.")
    public String getEndMarket() {
        return endMarket;
    }

    public void setEndMarket(String endMarket) {
        this.endMarket = endMarket;
    }

    public AccountCreationReq phoneNumber(String phoneNumber) {
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

    public AccountCreationReq postalCode(String postalCode) {
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

    public AccountCreationReq state(String state) {
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
        AccountCreationReq accountCreationReq = (AccountCreationReq) o;
        return Objects.equals(this.addressLine1, accountCreationReq.addressLine1)
               && Objects.equals(this.addressLine2, accountCreationReq.addressLine2)
               && Objects.equals(this.adminEmail, accountCreationReq.adminEmail)
               && Objects.equals(this.adminFullName, accountCreationReq.adminFullName)
               && Objects.equals(this.adminName, accountCreationReq.adminName)
               && Objects.equals(this.adminPassword, accountCreationReq.adminPassword)
               && Objects.equals(this.aliases, accountCreationReq.aliases)
               && Objects.equals(this.city, accountCreationReq.city)
               && Objects.equals(this.company, accountCreationReq.company)
               && Objects.equals(this.contact, accountCreationReq.contact)
               && Objects.equals(this.contractNumber, accountCreationReq.contractNumber)
               && Objects.equals(this.country, accountCreationReq.country)
               && Objects.equals(this.customerNumber, accountCreationReq.customerNumber)
               && Objects.equals(this.displayName, accountCreationReq.displayName)
               && Objects.equals(this.email, accountCreationReq.email)
               && Objects.equals(this.endMarket, accountCreationReq.endMarket)
               && Objects.equals(this.phoneNumber, accountCreationReq.phoneNumber)
               && Objects.equals(this.postalCode, accountCreationReq.postalCode)
               && Objects.equals(this.state, accountCreationReq.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, adminEmail, adminFullName, adminName, adminPassword, aliases,
                            city, company, contact, contractNumber, country, customerNumber, displayName, email,
                            endMarket, phoneNumber, postalCode, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountCreationReq {\n");

        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
        sb.append("    adminFullName: ").append(toIndentedString(adminFullName)).append("\n");
        sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
        sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    endMarket: ").append(toIndentedString(endMarket)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
