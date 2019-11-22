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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * DeviceQueryGteLteFilter
 */

public class DeviceQueryGteLteFilter implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("etag")
    private DateTime etag = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    public DeviceQueryGteLteFilter createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DeviceQueryGteLteFilter etag(DateTime etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get etag
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
    public DateTime getEtag() {
        return etag;
    }

    public void setEtag(DateTime etag) {
        this.etag = etag;
    }

    public DeviceQueryGteLteFilter updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceQueryGteLteFilter deviceQueryGteLteFilter = (DeviceQueryGteLteFilter) o;
        return Objects.equals(this.createdAt, deviceQueryGteLteFilter.createdAt)
               && Objects.equals(this.etag, deviceQueryGteLteFilter.etag)
               && Objects.equals(this.updatedAt, deviceQueryGteLteFilter.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, etag, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceQueryGteLteFilter {\n");

        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
