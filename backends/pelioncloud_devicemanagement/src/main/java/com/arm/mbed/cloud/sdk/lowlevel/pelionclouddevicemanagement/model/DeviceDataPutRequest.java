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
 * DeviceDataPutRequest
 */

public class DeviceDataPutRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("auto_update")
  private Boolean autoUpdate = null;

  @SerializedName("ca_id")
  private String caId = null;

  @SerializedName("custom_attributes")
  private Map<String, String> customAttributes = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("device_key")
  private String deviceKey = null;

  @SerializedName("endpoint_name")
  private String endpointName = null;

  @SerializedName("endpoint_type")
  private String endpointType = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("host_gateway")
  private String hostGateway = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("object")
  private String object = null;

  public DeviceDataPutRequest autoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
    return this;
  }

   /**
   * DEPRECATED: Mark this device for automatic firmware update.
   * @return autoUpdate
  **/
  @ApiModelProperty(value = "DEPRECATED: Mark this device for automatic firmware update.")
  public Boolean isAutoUpdate() {
    return autoUpdate;
  }

  public void setAutoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
  }

  public DeviceDataPutRequest caId(String caId) {
    this.caId = caId;
    return this;
  }

   /**
   * The certificate issuer&#39;s ID.
   * @return caId
  **/
  @ApiModelProperty(example = "00000000000000000000000000000000", value = "The certificate issuer's ID.")
  public String getCaId() {
    return caId;
  }

  public void setCaId(String caId) {
    this.caId = caId;
  }

  public DeviceDataPutRequest customAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public DeviceDataPutRequest putCustomAttributesItem(String key, String customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new HashMap<String, String>();
    }
    this.customAttributes.put(key, customAttributesItem);
    return this;
  }

   /**
   * Up to five custom key-value attributes. Note that keys cannot begin with a number. Both keys and values are limited to 128 characters. Updating this field replaces existing contents.
   * @return customAttributes
  **/
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "Up to five custom key-value attributes. Note that keys cannot begin with a number. Both keys and values are limited to 128 characters. Updating this field replaces existing contents.")
  public Map<String, String> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public DeviceDataPutRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the device.
   * @return description
  **/
  @ApiModelProperty(example = "", value = "The description of the device.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceDataPutRequest deviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
    return this;
  }

   /**
   * The fingerprint of the device certificate.
   * @return deviceKey
  **/
  @ApiModelProperty(example = "00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00:00", value = "The fingerprint of the device certificate.")
  public String getDeviceKey() {
    return deviceKey;
  }

  public void setDeviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
  }

   /**
   * The endpoint name given to the device.
   * @return endpointName
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The endpoint name given to the device.")
  public String getEndpointName() {
    return endpointName;
  }

  public DeviceDataPutRequest endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * The endpoint type of the device. For example, the device is a gateway.
   * @return endpointType
  **/
  @ApiModelProperty(example = "", value = "The endpoint type of the device. For example, the device is a gateway.")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public DeviceDataPutRequest groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public DeviceDataPutRequest addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * An array containing an ID of each group this device belongs to.
   * @return groups
  **/
  @ApiModelProperty(value = "An array containing an ID of each group this device belongs to.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public DeviceDataPutRequest hostGateway(String hostGateway) {
    this.hostGateway = hostGateway;
    return this;
  }

   /**
   * The &#x60;endpoint_name&#x60; of the host gateway, if appropriate.
   * @return hostGateway
  **/
  @ApiModelProperty(example = "", value = "The `endpoint_name` of the host gateway, if appropriate.")
  public String getHostGateway() {
    return hostGateway;
  }

  public void setHostGateway(String hostGateway) {
    this.hostGateway = hostGateway;
  }

  public DeviceDataPutRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the device.
   * @return name
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The name of the device.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceDataPutRequest object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The API resource entity.
   * @return object
  **/
  @ApiModelProperty(example = "device", value = "The API resource entity.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceDataPutRequest deviceDataPutRequest = (DeviceDataPutRequest) o;
    return Objects.equals(this.autoUpdate, deviceDataPutRequest.autoUpdate) &&
        Objects.equals(this.caId, deviceDataPutRequest.caId) &&
        Objects.equals(this.customAttributes, deviceDataPutRequest.customAttributes) &&
        Objects.equals(this.description, deviceDataPutRequest.description) &&
        Objects.equals(this.deviceKey, deviceDataPutRequest.deviceKey) &&
        Objects.equals(this.endpointName, deviceDataPutRequest.endpointName) &&
        Objects.equals(this.endpointType, deviceDataPutRequest.endpointType) &&
        Objects.equals(this.groups, deviceDataPutRequest.groups) &&
        Objects.equals(this.hostGateway, deviceDataPutRequest.hostGateway) &&
        Objects.equals(this.name, deviceDataPutRequest.name) &&
        Objects.equals(this.object, deviceDataPutRequest.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoUpdate, caId, customAttributes, description, deviceKey, endpointName, endpointType, groups, hostGateway, name, object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDataPutRequest {\n");
    
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceKey: ").append(toIndentedString(deviceKey)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    hostGateway: ").append(toIndentedString(hostGateway)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

