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
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * DeviceQueryEqNeqFilter
 */

public class DeviceQueryEqNeqFilter implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("etag")
    private DateTime etag = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("query")
    private String query = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    public DeviceQueryEqNeqFilter createdAt(DateTime createdAt) {
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

    public DeviceQueryEqNeqFilter etag(DateTime etag) {
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

    public DeviceQueryEqNeqFilter id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * 
     * @return id
     **/
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeviceQueryEqNeqFilter name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * 
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceQueryEqNeqFilter query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get query
     * 
     * @return query
     **/
    @ApiModelProperty(value = "")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public DeviceQueryEqNeqFilter updatedAt(DateTime updatedAt) {
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
        DeviceQueryEqNeqFilter deviceQueryEqNeqFilter = (DeviceQueryEqNeqFilter) o;
        return Objects.equals(this.createdAt, deviceQueryEqNeqFilter.createdAt)
               && Objects.equals(this.etag, deviceQueryEqNeqFilter.etag)
               && Objects.equals(this.id, deviceQueryEqNeqFilter.id)
               && Objects.equals(this.name, deviceQueryEqNeqFilter.name)
               && Objects.equals(this.query, deviceQueryEqNeqFilter.query)
               && Objects.equals(this.updatedAt, deviceQueryEqNeqFilter.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, etag, id, name, query, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceQueryEqNeqFilter {\n");

        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
