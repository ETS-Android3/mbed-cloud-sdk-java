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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * DeviceGteLteFilter
 */

public class DeviceGteLteFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("bootstrap_expiration_date")
  private DateTime bootstrapExpirationDate = null;

  @SerializedName("bootstrapped_timestamp")
  private DateTime bootstrappedTimestamp = null;

  @SerializedName("connector_expiration_date")
  private DateTime connectorExpirationDate = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("enrolment_list_timestamp")
  private DateTime enrolmentListTimestamp = null;

  @SerializedName("etag")
  private DateTime etag = null;

  @SerializedName("manifest_timestamp")
  private DateTime manifestTimestamp = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public DeviceGteLteFilter bootstrapExpirationDate(DateTime bootstrapExpirationDate) {
    this.bootstrapExpirationDate = bootstrapExpirationDate;
    return this;
  }

   /**
   * Get bootstrapExpirationDate
   * @return bootstrapExpirationDate
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getBootstrapExpirationDate() {
    return bootstrapExpirationDate;
  }

  public void setBootstrapExpirationDate(DateTime bootstrapExpirationDate) {
    this.bootstrapExpirationDate = bootstrapExpirationDate;
  }

  public DeviceGteLteFilter bootstrappedTimestamp(DateTime bootstrappedTimestamp) {
    this.bootstrappedTimestamp = bootstrappedTimestamp;
    return this;
  }

   /**
   * Get bootstrappedTimestamp
   * @return bootstrappedTimestamp
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getBootstrappedTimestamp() {
    return bootstrappedTimestamp;
  }

  public void setBootstrappedTimestamp(DateTime bootstrappedTimestamp) {
    this.bootstrappedTimestamp = bootstrappedTimestamp;
  }

  public DeviceGteLteFilter connectorExpirationDate(DateTime connectorExpirationDate) {
    this.connectorExpirationDate = connectorExpirationDate;
    return this;
  }

   /**
   * Get connectorExpirationDate
   * @return connectorExpirationDate
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getConnectorExpirationDate() {
    return connectorExpirationDate;
  }

  public void setConnectorExpirationDate(DateTime connectorExpirationDate) {
    this.connectorExpirationDate = connectorExpirationDate;
  }

  public DeviceGteLteFilter createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DeviceGteLteFilter enrolmentListTimestamp(DateTime enrolmentListTimestamp) {
    this.enrolmentListTimestamp = enrolmentListTimestamp;
    return this;
  }

   /**
   * Get enrolmentListTimestamp
   * @return enrolmentListTimestamp
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getEnrolmentListTimestamp() {
    return enrolmentListTimestamp;
  }

  public void setEnrolmentListTimestamp(DateTime enrolmentListTimestamp) {
    this.enrolmentListTimestamp = enrolmentListTimestamp;
  }

  public DeviceGteLteFilter etag(DateTime etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Get etag
   * @return etag
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getEtag() {
    return etag;
  }

  public void setEtag(DateTime etag) {
    this.etag = etag;
  }

  public DeviceGteLteFilter manifestTimestamp(DateTime manifestTimestamp) {
    this.manifestTimestamp = manifestTimestamp;
    return this;
  }

   /**
   * Get manifestTimestamp
   * @return manifestTimestamp
  **/
  @ApiModelProperty(example = "2017-05-22T12:37:55.576563Z", value = "")
  public DateTime getManifestTimestamp() {
    return manifestTimestamp;
  }

  public void setManifestTimestamp(DateTime manifestTimestamp) {
    this.manifestTimestamp = manifestTimestamp;
  }

  public DeviceGteLteFilter updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
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
    DeviceGteLteFilter deviceGteLteFilter = (DeviceGteLteFilter) o;
    return Objects.equals(this.bootstrapExpirationDate, deviceGteLteFilter.bootstrapExpirationDate) &&
        Objects.equals(this.bootstrappedTimestamp, deviceGteLteFilter.bootstrappedTimestamp) &&
        Objects.equals(this.connectorExpirationDate, deviceGteLteFilter.connectorExpirationDate) &&
        Objects.equals(this.createdAt, deviceGteLteFilter.createdAt) &&
        Objects.equals(this.enrolmentListTimestamp, deviceGteLteFilter.enrolmentListTimestamp) &&
        Objects.equals(this.etag, deviceGteLteFilter.etag) &&
        Objects.equals(this.manifestTimestamp, deviceGteLteFilter.manifestTimestamp) &&
        Objects.equals(this.updatedAt, deviceGteLteFilter.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootstrapExpirationDate, bootstrappedTimestamp, connectorExpirationDate, createdAt, enrolmentListTimestamp, etag, manifestTimestamp, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceGteLteFilter {\n");
    
    sb.append("    bootstrapExpirationDate: ").append(toIndentedString(bootstrapExpirationDate)).append("\n");
    sb.append("    bootstrappedTimestamp: ").append(toIndentedString(bootstrappedTimestamp)).append("\n");
    sb.append("    connectorExpirationDate: ").append(toIndentedString(connectorExpirationDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    enrolmentListTimestamp: ").append(toIndentedString(enrolmentListTimestamp)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    manifestTimestamp: ").append(toIndentedString(manifestTimestamp)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

