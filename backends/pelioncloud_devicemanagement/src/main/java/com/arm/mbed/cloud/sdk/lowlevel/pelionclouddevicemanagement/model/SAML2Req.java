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
import java.util.List;
import java.io.Serializable;

/**
 * SAML2Req
 */

public class SAML2Req implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("entity_descriptor")
  private String entityDescriptor = null;

  @SerializedName("idp_entity_id")
  private String idpEntityId = null;

  @SerializedName("idp_x509_certs")
  private List<String> idpX509Certs = null;

  @SerializedName("slo_endpoint")
  private String sloEndpoint = null;

  @SerializedName("sp_entity_id")
  private String spEntityId = null;

  @SerializedName("sso_endpoint")
  private String ssoEndpoint = null;

  public SAML2Req entityDescriptor(String entityDescriptor) {
    this.entityDescriptor = entityDescriptor;
    return this;
  }

   /**
   * Base64 encoded string representation of an XML file. Contains an entity descriptor document for the identity provider. Can be used as an alternative method to provide the identity provider&#39;s attributes.
   * @return entityDescriptor
  **/
  @ApiModelProperty(value = "Base64 encoded string representation of an XML file. Contains an entity descriptor document for the identity provider. Can be used as an alternative method to provide the identity provider's attributes.")
  public String getEntityDescriptor() {
    return entityDescriptor;
  }

  public void setEntityDescriptor(String entityDescriptor) {
    this.entityDescriptor = entityDescriptor;
  }

  public SAML2Req idpEntityId(String idpEntityId) {
    this.idpEntityId = idpEntityId;
    return this;
  }

   /**
   * Entity ID of the identity provider.
   * @return idpEntityId
  **/
  @ApiModelProperty(value = "Entity ID of the identity provider.")
  public String getIdpEntityId() {
    return idpEntityId;
  }

  public void setIdpEntityId(String idpEntityId) {
    this.idpEntityId = idpEntityId;
  }

  public SAML2Req idpX509Certs(List<String> idpX509Certs) {
    this.idpX509Certs = idpX509Certs;
    return this;
  }

  public SAML2Req addIdpX509CertsItem(String idpX509CertsItem) {
    if (this.idpX509Certs == null) {
      this.idpX509Certs = new ArrayList<String>();
    }
    this.idpX509Certs.add(idpX509CertsItem);
    return this;
  }

   /**
   * List of public X509 certificates of the identity provider. Certificates must be in PEM format. Limit of 100 certificates.
   * @return idpX509Certs
  **/
  @ApiModelProperty(value = "List of public X509 certificates of the identity provider. Certificates must be in PEM format. Limit of 100 certificates.")
  public List<String> getIdpX509Certs() {
    return idpX509Certs;
  }

  public void setIdpX509Certs(List<String> idpX509Certs) {
    this.idpX509Certs = idpX509Certs;
  }

  public SAML2Req sloEndpoint(String sloEndpoint) {
    this.sloEndpoint = sloEndpoint;
    return this;
  }

   /**
   * URL of the identity provider&#39;s SLO endpoint.
   * @return sloEndpoint
  **/
  @ApiModelProperty(value = "URL of the identity provider's SLO endpoint.")
  public String getSloEndpoint() {
    return sloEndpoint;
  }

  public void setSloEndpoint(String sloEndpoint) {
    this.sloEndpoint = sloEndpoint;
  }

  public SAML2Req spEntityId(String spEntityId) {
    this.spEntityId = spEntityId;
    return this;
  }

   /**
   * Entity ID of the service provider. We recommend that you leave it empty and let the system generate it.
   * @return spEntityId
  **/
  @ApiModelProperty(value = "Entity ID of the service provider. We recommend that you leave it empty and let the system generate it.")
  public String getSpEntityId() {
    return spEntityId;
  }

  public void setSpEntityId(String spEntityId) {
    this.spEntityId = spEntityId;
  }

  public SAML2Req ssoEndpoint(String ssoEndpoint) {
    this.ssoEndpoint = ssoEndpoint;
    return this;
  }

   /**
   * URL of the identity provider&#39;s SSO endpoint.
   * @return ssoEndpoint
  **/
  @ApiModelProperty(value = "URL of the identity provider's SSO endpoint.")
  public String getSsoEndpoint() {
    return ssoEndpoint;
  }

  public void setSsoEndpoint(String ssoEndpoint) {
    this.ssoEndpoint = ssoEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAML2Req saML2Req = (SAML2Req) o;
    return Objects.equals(this.entityDescriptor, saML2Req.entityDescriptor) &&
        Objects.equals(this.idpEntityId, saML2Req.idpEntityId) &&
        Objects.equals(this.idpX509Certs, saML2Req.idpX509Certs) &&
        Objects.equals(this.sloEndpoint, saML2Req.sloEndpoint) &&
        Objects.equals(this.spEntityId, saML2Req.spEntityId) &&
        Objects.equals(this.ssoEndpoint, saML2Req.ssoEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityDescriptor, idpEntityId, idpX509Certs, sloEndpoint, spEntityId, ssoEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAML2Req {\n");
    
    sb.append("    entityDescriptor: ").append(toIndentedString(entityDescriptor)).append("\n");
    sb.append("    idpEntityId: ").append(toIndentedString(idpEntityId)).append("\n");
    sb.append("    idpX509Certs: ").append(toIndentedString(idpX509Certs)).append("\n");
    sb.append("    sloEndpoint: ").append(toIndentedString(sloEndpoint)).append("\n");
    sb.append("    spEntityId: ").append(toIndentedString(spEntityId)).append("\n");
    sb.append("    ssoEndpoint: ").append(toIndentedString(ssoEndpoint)).append("\n");
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

