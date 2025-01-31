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
 * Update existing federated identity provider module.
 */
@ApiModel(description = "Update existing federated identity provider module.")

public class IdentityProviderUpdateReq implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("description")
    private String description = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("oidc_attributes")
    private OIDCInfo oidcAttributes = null;

    @SerializedName("saml2_attributes")
    private SAML2Req saml2Attributes = null;

    /**
     * Status of the identity provider.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        ACTIVE("ACTIVE"),

        SUSPENDED("SUSPENDED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("status")
    private StatusEnum status = null;

    /**
     * Identity provider type.
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        SAML2("SAML2");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("type")
    private TypeEnum type = null;

    public IdentityProviderUpdateReq description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description for the identity provider.
     * 
     * @return description
     **/
    @ApiModelProperty(value = "Description for the identity provider.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IdentityProviderUpdateReq name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the identity provider.
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "Name of the identity provider.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IdentityProviderUpdateReq oidcAttributes(OIDCInfo oidcAttributes) {
        this.oidcAttributes = oidcAttributes;
        return this;
    }

    /**
     * OIDC specific attributes.
     * 
     * @return oidcAttributes
     **/
    @ApiModelProperty(value = "OIDC specific attributes.")
    public OIDCInfo getOidcAttributes() {
        return oidcAttributes;
    }

    public void setOidcAttributes(OIDCInfo oidcAttributes) {
        this.oidcAttributes = oidcAttributes;
    }

    public IdentityProviderUpdateReq saml2Attributes(SAML2Req saml2Attributes) {
        this.saml2Attributes = saml2Attributes;
        return this;
    }

    /**
     * SAML2 specific attributes.
     * 
     * @return saml2Attributes
     **/
    @ApiModelProperty(value = "SAML2 specific attributes.")
    public SAML2Req getSaml2Attributes() {
        return saml2Attributes;
    }

    public void setSaml2Attributes(SAML2Req saml2Attributes) {
        this.saml2Attributes = saml2Attributes;
    }

    public IdentityProviderUpdateReq status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status of the identity provider.
     * 
     * @return status
     **/
    @ApiModelProperty(value = "Status of the identity provider.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public IdentityProviderUpdateReq type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Identity provider type.
     * 
     * @return type
     **/
    @ApiModelProperty(required = true, value = "Identity provider type.")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityProviderUpdateReq identityProviderUpdateReq = (IdentityProviderUpdateReq) o;
        return Objects.equals(this.description, identityProviderUpdateReq.description)
               && Objects.equals(this.name, identityProviderUpdateReq.name)
               && Objects.equals(this.oidcAttributes, identityProviderUpdateReq.oidcAttributes)
               && Objects.equals(this.saml2Attributes, identityProviderUpdateReq.saml2Attributes)
               && Objects.equals(this.status, identityProviderUpdateReq.status)
               && Objects.equals(this.type, identityProviderUpdateReq.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, oidcAttributes, saml2Attributes, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityProviderUpdateReq {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    oidcAttributes: ").append(toIndentedString(oidcAttributes)).append("\n");
        sb.append("    saml2Attributes: ").append(toIndentedString(saml2Attributes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
