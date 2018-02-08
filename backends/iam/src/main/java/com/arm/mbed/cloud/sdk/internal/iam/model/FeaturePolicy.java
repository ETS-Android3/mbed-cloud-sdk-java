/*
 * Account Management API
 * API for managing accounts, users, creating API keys, uploading trusted certificates
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.iam.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * This object represents a feature policy. Either the feature or the resource must be specified.
 */
@ApiModel(description = "This object represents a feature policy. Either the feature or the resource must be specified.")

public class FeaturePolicy implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("action")
  private String action = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("feature")
  private String feature = null;

  @SerializedName("allow")
  private Boolean allow = null;

  @SerializedName("inherited")
  private Boolean inherited = null;

  public FeaturePolicy action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Comma separated list of actions, empty string represents all actions.
   * @return action
  **/
  @ApiModelProperty(value = "Comma separated list of actions, empty string represents all actions.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public FeaturePolicy resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Resource that is protected by this policy.
   * @return resource
  **/
  @ApiModelProperty(value = "Resource that is protected by this policy.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public FeaturePolicy feature(String feature) {
    this.feature = feature;
    return this;
  }

   /**
   * Feature name corresponding to this policy.
   * @return feature
  **/
  @ApiModelProperty(value = "Feature name corresponding to this policy.")
  public String getFeature() {
    return feature;
  }

  public void setFeature(String feature) {
    this.feature = feature;
  }

  public FeaturePolicy allow(Boolean allow) {
    this.allow = allow;
    return this;
  }

   /**
   * True or false controlling whether an action is allowed or not.
   * @return allow
  **/
  @ApiModelProperty(value = "True or false controlling whether an action is allowed or not.")
  public Boolean isAllow() {
    return allow;
  }

  public void setAllow(Boolean allow) {
    this.allow = allow;
  }

  public FeaturePolicy inherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

   /**
   * Flag indicating whether this feature is inherited or overwritten specifically.
   * @return inherited
  **/
  @ApiModelProperty(value = "Flag indicating whether this feature is inherited or overwritten specifically.")
  public Boolean isInherited() {
    return inherited;
  }

  public void setInherited(Boolean inherited) {
    this.inherited = inherited;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturePolicy featurePolicy = (FeaturePolicy) o;
    return Objects.equals(this.action, featurePolicy.action) &&
        Objects.equals(this.resource, featurePolicy.resource) &&
        Objects.equals(this.feature, featurePolicy.feature) &&
        Objects.equals(this.allow, featurePolicy.allow) &&
        Objects.equals(this.inherited, featurePolicy.inherited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, resource, feature, allow, inherited);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturePolicy {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
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

