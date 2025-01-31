/*
 * Pelion Device Management API
 * Pelion Device Management API build from the publicly defined API definitions.
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
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

/**
 * Group
 */

public class Group implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("custom_attributes")
    private Map<String, String> customAttributes = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("name")
    private String name = null;

    public Group customAttributes(Map<String, String> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    public Group putCustomAttributesItem(String key, String customAttributesItem) {
        if (this.customAttributes == null) {
            this.customAttributes = new HashMap<String, String>();
        }
        this.customAttributes.put(key, customAttributesItem);
        return this;
    }

    /**
     * Up to ten custom key-value attributes. Keys cannot begin with a number. Both key and value are limited to 128
     * characters. Updating this field replaces existing contents.
     * 
     * @return customAttributes
     **/
    @ApiModelProperty(example = "{\"key\":\"value\"}",
                      value = "Up to ten custom key-value attributes. Keys cannot begin with a number. Both key and value are limited to 128 characters. Updating this field replaces existing contents.")
    public Map<String, String> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(Map<String, String> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public Group description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the group.
     * 
     * @return description
     **/
    @ApiModelProperty(example = "Devices on the factory floor.", value = "The description of the group.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Group name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the group.
     * 
     * @return name
     **/
    @ApiModelProperty(example = "My devices", value = "Name of the group.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Group group = (Group) o;
        return Objects.equals(this.customAttributes, group.customAttributes)
               && Objects.equals(this.description, group.description) && Objects.equals(this.name, group.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customAttributes, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Group {\n");

        sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
