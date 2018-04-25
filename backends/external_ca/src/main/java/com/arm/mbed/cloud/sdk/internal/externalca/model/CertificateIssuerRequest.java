/*
 * Third party CA management API
 * API for managing third party CA for creating certificates on Mbed Cloud
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.externalca.model;

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
 * CertificateIssuerRequest
 */

public class CertificateIssuerRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("description")
  private String description = null;

  @SerializedName("issuer_attributes")
  private Object issuerAttributes = null;

  @SerializedName("issuer_credentials")
  private Object issuerCredentials = null;

  /**
   * Type of certificate issuer. - GLOBAL_SIGN:   Certificates are issued by GlobalSign service. The users must provide their own GlobalSign account credentials. 
   */
  @JsonAdapter(IssuerTypeEnum.Adapter.class)
  public enum IssuerTypeEnum {
    SIGN("GLOBAL_SIGN");

    private String value;

    IssuerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IssuerTypeEnum fromValue(String text) {
      for (IssuerTypeEnum b : IssuerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IssuerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IssuerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IssuerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IssuerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("issuer_type")
  private IssuerTypeEnum issuerType = null;

  @SerializedName("name")
  private String name = null;

  public CertificateIssuerRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * General description for the certificate issuer.
   * @return description
  **/
  @ApiModelProperty(value = "General description for the certificate issuer.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CertificateIssuerRequest issuerAttributes(Object issuerAttributes) {
    this.issuerAttributes = issuerAttributes;
    return this;
  }

   /**
   * General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the value shall be empty. 
   * @return issuerAttributes
  **/
  @ApiModelProperty(value = "General attributes for connecting the certificate issuer. When the issuer_type is GLOBAL_SIGN, the value shall be empty. ")
  public Object getIssuerAttributes() {
    return issuerAttributes;
  }

  public void setIssuerAttributes(Object issuerAttributes) {
    this.issuerAttributes = issuerAttributes;
  }

  public CertificateIssuerRequest issuerCredentials(Object issuerCredentials) {
    this.issuerCredentials = issuerCredentials;
    return this;
  }

   /**
   * Credentials required for connecting to the certificate issuer. When the issuer_type is GLOBAL_SIGN, see definition of GlobalSignCredentials. 
   * @return issuerCredentials
  **/
  @ApiModelProperty(value = "Credentials required for connecting to the certificate issuer. When the issuer_type is GLOBAL_SIGN, see definition of GlobalSignCredentials. ")
  public Object getIssuerCredentials() {
    return issuerCredentials;
  }

  public void setIssuerCredentials(Object issuerCredentials) {
    this.issuerCredentials = issuerCredentials;
  }

  public CertificateIssuerRequest issuerType(IssuerTypeEnum issuerType) {
    this.issuerType = issuerType;
    return this;
  }

   /**
   * Type of certificate issuer. - GLOBAL_SIGN:   Certificates are issued by GlobalSign service. The users must provide their own GlobalSign account credentials. 
   * @return issuerType
  **/
  @ApiModelProperty(required = true, value = "Type of certificate issuer. - GLOBAL_SIGN:   Certificates are issued by GlobalSign service. The users must provide their own GlobalSign account credentials. ")
  public IssuerTypeEnum getIssuerType() {
    return issuerType;
  }

  public void setIssuerType(IssuerTypeEnum issuerType) {
    this.issuerType = issuerType;
  }

  public CertificateIssuerRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Certificate issuer name, unique per account.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Certificate issuer name, unique per account.")
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
    CertificateIssuerRequest certificateIssuerRequest = (CertificateIssuerRequest) o;
    return Objects.equals(this.description, certificateIssuerRequest.description) &&
        Objects.equals(this.issuerAttributes, certificateIssuerRequest.issuerAttributes) &&
        Objects.equals(this.issuerCredentials, certificateIssuerRequest.issuerCredentials) &&
        Objects.equals(this.issuerType, certificateIssuerRequest.issuerType) &&
        Objects.equals(this.name, certificateIssuerRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, issuerAttributes, issuerCredentials, issuerType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateIssuerRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issuerAttributes: ").append(toIndentedString(issuerAttributes)).append("\n");
    sb.append("    issuerCredentials: ").append(toIndentedString(issuerCredentials)).append("\n");
    sb.append("    issuerType: ").append(toIndentedString(issuerType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

