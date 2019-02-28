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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * This object represents SAML2 specific attributes in responses.
 */
@ApiModel(description = "This object represents SAML2 specific attributes in responses.")

public class SAML2Info implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("assertion_endpoint")
    private String assertionEndpoint = null;

    @SerializedName("idp_entity_id")
    private String idpEntityId = null;

    @SerializedName("idp_x509_certs")
    private List<String> idpX509Certs = null;

    @SerializedName("slo_endpoint")
    private String sloEndpoint = null;

    @SerializedName("sp_entity_id")
    private String spEntityId = null;

    @SerializedName("sp_x509_cert")
    private String spX509Cert = null;

    @SerializedName("sso_endpoint")
    private String ssoEndpoint = null;

    public SAML2Info assertionEndpoint(String assertionEndpoint) {
        this.assertionEndpoint = assertionEndpoint;
        return this;
    }

    /**
     * URL of the service provider&#39;s assertion endpoint.
     * 
     * @return assertionEndpoint
     **/
    @ApiModelProperty(value = "URL of the service provider's assertion endpoint.")
    public String getAssertionEndpoint() {
        return assertionEndpoint;
    }

    public void setAssertionEndpoint(String assertionEndpoint) {
        this.assertionEndpoint = assertionEndpoint;
    }

    public SAML2Info idpEntityId(String idpEntityId) {
        this.idpEntityId = idpEntityId;
        return this;
    }

    /**
     * Entity ID of the identity provider.
     * 
     * @return idpEntityId
     **/
    @ApiModelProperty(value = "Entity ID of the identity provider.")
    public String getIdpEntityId() {
        return idpEntityId;
    }

    public void setIdpEntityId(String idpEntityId) {
        this.idpEntityId = idpEntityId;
    }

    public SAML2Info idpX509Certs(List<String> idpX509Certs) {
        this.idpX509Certs = idpX509Certs;
        return this;
    }

    public SAML2Info addIdpX509CertsItem(String idpX509CertsItem) {
        if (this.idpX509Certs == null) {
            this.idpX509Certs = new ArrayList<String>();
        }
        this.idpX509Certs.add(idpX509CertsItem);
        return this;
    }

    /**
     * List of public X509 certificates of the identity provider in PEM format.
     * 
     * @return idpX509Certs
     **/
    @ApiModelProperty(value = "List of public X509 certificates of the identity provider in PEM format.")
    public List<String> getIdpX509Certs() {
        return idpX509Certs;
    }

    public void setIdpX509Certs(List<String> idpX509Certs) {
        this.idpX509Certs = idpX509Certs;
    }

    public SAML2Info sloEndpoint(String sloEndpoint) {
        this.sloEndpoint = sloEndpoint;
        return this;
    }

    /**
     * URL of the identity provider&#39;s SLO endpoint.
     * 
     * @return sloEndpoint
     **/
    @ApiModelProperty(value = "URL of the identity provider's SLO endpoint.")
    public String getSloEndpoint() {
        return sloEndpoint;
    }

    public void setSloEndpoint(String sloEndpoint) {
        this.sloEndpoint = sloEndpoint;
    }

    public SAML2Info spEntityId(String spEntityId) {
        this.spEntityId = spEntityId;
        return this;
    }

    /**
     * Entity ID of the service provider.
     * 
     * @return spEntityId
     **/
    @ApiModelProperty(value = "Entity ID of the service provider.")
    public String getSpEntityId() {
        return spEntityId;
    }

    public void setSpEntityId(String spEntityId) {
        this.spEntityId = spEntityId;
    }

    /**
     * Public X509 certificate of the service provider in PEM format. This is a read-only attribute, see API
     * documentation about how to generate a new one or how to delete it.
     * 
     * @return spX509Cert
     **/
    @ApiModelProperty(value = "Public X509 certificate of the service provider in PEM format. This is a read-only attribute, see API documentation about how to generate a new one or how to delete it.")
    public String getSpX509Cert() {
        return spX509Cert;
    }

    public SAML2Info ssoEndpoint(String ssoEndpoint) {
        this.ssoEndpoint = ssoEndpoint;
        return this;
    }

    /**
     * URL of the identity provider&#39;s SSO endpoint.
     * 
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
        SAML2Info saML2Info = (SAML2Info) o;
        return Objects.equals(this.assertionEndpoint, saML2Info.assertionEndpoint)
               && Objects.equals(this.idpEntityId, saML2Info.idpEntityId)
               && Objects.equals(this.idpX509Certs, saML2Info.idpX509Certs)
               && Objects.equals(this.sloEndpoint, saML2Info.sloEndpoint)
               && Objects.equals(this.spEntityId, saML2Info.spEntityId)
               && Objects.equals(this.spX509Cert, saML2Info.spX509Cert)
               && Objects.equals(this.ssoEndpoint, saML2Info.ssoEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assertionEndpoint, idpEntityId, idpX509Certs, sloEndpoint, spEntityId, spX509Cert,
                            ssoEndpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SAML2Info {\n");

        sb.append("    assertionEndpoint: ").append(toIndentedString(assertionEndpoint)).append("\n");
        sb.append("    idpEntityId: ").append(toIndentedString(idpEntityId)).append("\n");
        sb.append("    idpX509Certs: ").append(toIndentedString(idpX509Certs)).append("\n");
        sb.append("    sloEndpoint: ").append(toIndentedString(sloEndpoint)).append("\n");
        sb.append("    spEntityId: ").append(toIndentedString(spEntityId)).append("\n");
        sb.append("    spX509Cert: ").append(toIndentedString(spX509Cert)).append("\n");
        sb.append("    ssoEndpoint: ").append(toIndentedString(ssoEndpoint)).append("\n");
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
