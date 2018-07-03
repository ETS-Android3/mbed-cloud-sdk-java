/*
 * billing REST API documentation
 * This document contains the public REST API definitions of the mbed-billing service.
 *
 * OpenAPI spec version: 1.4.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.billing.model;

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
 * Account&#39;s service package metadata.
 */
@ApiModel(description = "Account's service package metadata.")

public class ServicePackageMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("end_time")
  private DateTime endTime = null;

  @SerializedName("remaining_quota")
  private Long remainingQuota = null;

  @SerializedName("reserved_quota")
  private Long reservedQuota = null;

  @SerializedName("start_time")
  private DateTime startTime = null;

  public ServicePackageMetadata endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Service package end time.
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "Service package end time.")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public ServicePackageMetadata remainingQuota(Long remainingQuota) {
    this.remainingQuota = remainingQuota;
    return this;
  }

   /**
   * Current available service package quota.
   * minimum: 0
   * @return remainingQuota
  **/
  @ApiModelProperty(required = true, value = "Current available service package quota.")
  public Long getRemainingQuota() {
    return remainingQuota;
  }

  public void setRemainingQuota(Long remainingQuota) {
    this.remainingQuota = remainingQuota;
  }

  public ServicePackageMetadata reservedQuota(Long reservedQuota) {
    this.reservedQuota = reservedQuota;
    return this;
  }

   /**
   * Sum of all open reservations for this account.
   * minimum: 0
   * @return reservedQuota
  **/
  @ApiModelProperty(required = true, value = "Sum of all open reservations for this account.")
  public Long getReservedQuota() {
    return reservedQuota;
  }

  public void setReservedQuota(Long reservedQuota) {
    this.reservedQuota = reservedQuota;
  }

  public ServicePackageMetadata startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Service package start time.
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Service package start time.")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePackageMetadata servicePackageMetadata = (ServicePackageMetadata) o;
    return Objects.equals(this.endTime, servicePackageMetadata.endTime) &&
        Objects.equals(this.remainingQuota, servicePackageMetadata.remainingQuota) &&
        Objects.equals(this.reservedQuota, servicePackageMetadata.reservedQuota) &&
        Objects.equals(this.startTime, servicePackageMetadata.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, remainingQuota, reservedQuota, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePackageMetadata {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    remainingQuota: ").append(toIndentedString(remainingQuota)).append("\n");
    sb.append("    reservedQuota: ").append(toIndentedString(reservedQuota)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

