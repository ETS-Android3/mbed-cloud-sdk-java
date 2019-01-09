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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * EndpointData
 */

public class EndpointData implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("ep")
    private String ep = null;

    @SerializedName("ept")
    private String ept = null;

    @SerializedName("original-ep")
    private String originalEp = null;

    @SerializedName("q")
    private Boolean q = null;

    @SerializedName("resources")
    private List<ResourcesData> resources = null;

    public EndpointData ep(String ep) {
        this.ep = ep;
        return this;
    }

    /**
     * Unique Device Management device ID.
     * 
     * @return ep
     **/
    @ApiModelProperty(example = "015f3850a657000000000001001002ab", value = "Unique Device Management device ID.")
    public String getEp() {
        return ep;
    }

    public void setEp(String ep) {
        this.ep = ep;
    }

    public EndpointData ept(String ept) {
        this.ept = ept;
        return this;
    }

    /**
     * Endpoint type.
     * 
     * @return ept
     **/
    @ApiModelProperty(example = "Light", value = "Endpoint type.")
    public String getEpt() {
        return ept;
    }

    public void setEpt(String ept) {
        this.ept = ept;
    }

    public EndpointData originalEp(String originalEp) {
        this.originalEp = originalEp;
        return this;
    }

    /**
     * In case of a self-provided endpoint name that is used to initiate the device registration, Device Management
     * provides a new device ID to be used from that point on. The new Pelion platform provided Device ID is forwarded
     * as the &#39;ep&#39; property and the original self-provided one as the optional &#39;original-ep&#39; property in
     * a registration notification. The name and ID can then be mapped accordingly. Device Management saves the original
     * endpoint name in the Device Directory for future device registrations so that you don&#39;t need to do the
     * mapping again.
     * 
     * @return originalEp
     **/
    @ApiModelProperty(example = "my-device-123",
                      value = "In case of a self-provided endpoint name that is used to initiate the device registration, Device Management provides a new device ID to be used from that point on. The new Pelion platform provided Device ID is forwarded as the 'ep' property and the original self-provided one as the optional 'original-ep' property in a registration notification. The name and ID can then be mapped accordingly. Device Management saves the original endpoint name in the Device Directory for future device registrations so that you don't need to do the mapping again. ")
    public String getOriginalEp() {
        return originalEp;
    }

    public void setOriginalEp(String originalEp) {
        this.originalEp = originalEp;
    }

    public EndpointData q(Boolean q) {
        this.q = q;
        return this;
    }

    /**
     * Queue mode (default value is false).
     * 
     * @return q
     **/
    @ApiModelProperty(example = "false", value = "Queue mode (default value is false).")
    public Boolean isQ() {
        return q;
    }

    public void setQ(Boolean q) {
        this.q = q;
    }

    public EndpointData resources(List<ResourcesData> resources) {
        this.resources = resources;
        return this;
    }

    public EndpointData addResourcesItem(ResourcesData resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<ResourcesData>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    /**
     * Get resources
     * 
     * @return resources
     **/
    @ApiModelProperty(value = "")
    public List<ResourcesData> getResources() {
        return resources;
    }

    public void setResources(List<ResourcesData> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EndpointData endpointData = (EndpointData) o;
        return Objects.equals(this.ep, endpointData.ep) && Objects.equals(this.ept, endpointData.ept)
               && Objects.equals(this.originalEp, endpointData.originalEp) && Objects.equals(this.q, endpointData.q)
               && Objects.equals(this.resources, endpointData.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ep, ept, originalEp, q, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointData {\n");

        sb.append("    ep: ").append(toIndentedString(ep)).append("\n");
        sb.append("    ept: ").append(toIndentedString(ept)).append("\n");
        sb.append("    originalEp: ").append(toIndentedString(originalEp)).append("\n");
        sb.append("    q: ").append(toIndentedString(q)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
