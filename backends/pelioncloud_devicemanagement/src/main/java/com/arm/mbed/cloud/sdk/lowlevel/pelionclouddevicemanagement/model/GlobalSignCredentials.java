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
import java.io.Serializable;

/**
 * Describes the credentials required to connect to the GlobalSign account. The values should be taken from GlobalSign
 * support upon account creation.
 */
@ApiModel(description = "Describes the credentials required to connect to the GlobalSign account. The values should be taken from GlobalSign support upon account creation. ")

public class GlobalSignCredentials implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("api_key")
    private String apiKey = null;

    @SerializedName("api_secret")
    private String apiSecret = null;

    @SerializedName("client_certificate")
    private String clientCertificate = null;

    @SerializedName("passphrase")
    private String passphrase = null;

    @SerializedName("private_key")
    private String privateKey = null;

    public GlobalSignCredentials apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Unique ID for API client (provided by GlobalSign).
     * 
     * @return apiKey
     **/
    @ApiModelProperty(example = "e510e289e6cd8947", required = true,
                      value = "Unique ID for API client (provided by GlobalSign). ")
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public GlobalSignCredentials apiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }

    /**
     * API Secret matching the API key (provided by GlobalSign).
     * 
     * @return apiSecret
     **/
    @ApiModelProperty(example = "a477a8393d17a55ecb2ba6a61f58feb84770b621", required = true,
                      value = "API Secret matching the API key (provided by GlobalSign). ")
    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public GlobalSignCredentials clientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }

    /**
     * The client certificate provided by GlobalSign to allow HTTPS connection over TLS/SSL. The certificate wraps a
     * public key that matches a private key provided by the customer. The certificate must be in PEM format.
     * 
     * @return clientCertificate
     **/
    @ApiModelProperty(example = "\"-----BEGIN CERTIFICATE-----MIIC7zCCAdegAwIBAgIJANTlU4x5S74VMA0GCSqGSIb3DQEBCwUAMA4xDDAKBgNVBAoMA0FybTAeFw0xODAzMTExMzE5MTFaFw0xOTAzMTExMzE5MTFaMA4xDDAKBgNVBAoMA0FybTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJWLStsVMJULZtxdieK9qocM4ymDXMaAusmd9TZLzBgznKQe/CW2yxyA8C8K5e6MmvMYGeKDd4Lkw/ezOj2OsUj2xzNIltUxpGi/GhsNYiN/khNJa/Y1SllLoihJAPm/xbMywOBRu/dM88PiJsNZccOk0I8DYvvyAs9wCTkbKLnfHygl98DCRqXw7nBCplU6F03qpUd/4BUtMtugyqt7yboGH+4YewnUh4Yh4QNOJIvE93Ob++eKjO3pIOYEhQmUxzOLaLNuWXlv2l1WuN281hUP4XBcV8mCzRQfTBBDYTWt+5BEWoLOUkXjW0Um6EAaN3usph1IKDEH6Ia5VHP4Pj0CAwEAAaNQME4wHQYDVR0OBBYEFLsfYZxFcQTjPJKYMjHI2In316fmMB8GA1UdIwQYMBaAFLsfYZxFcQTjPJKYMjHI2In316fmMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQELBQADggEBAFl08GFsIkkUs6M7QgCWmsnwP6PtD8V87wM1GAqQQlOOeztaeRR2TEOeYiKRZQugYszJ/FVfVp4ggqzepJMn6UZ42j5nmSJs+6t79i23QAzX1zNQ354lr/t7kt3fMdhuL3AP0oZGzdy+EnXXiWeAD22UwzvVmLt38ypJIl+pmTsx9jJy4PN7yoRgtP9k+50m3X6oDxVruehC/JPSeTvEhqyLW3fLcG6IoJMX3vIwfO9uXbFJumTowQeViNJJ9duWvD2KBXn/muOOBe97TPuvAms1gOtMmmPT9/jpo9b4+NsfFiAN6bMici81aIKZzLC+lLGOUmR2fFJyM5OsVLxKsko=-----END CERTIFICATE-----\"",
                      required = true,
                      value = "The client certificate provided by GlobalSign to allow HTTPS connection over TLS/SSL. The certificate wraps a public key that matches a private key provided by the customer. The certificate must be in PEM format. ")
    public String getClientCertificate() {
        return clientCertificate;
    }

    public void setClientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    public GlobalSignCredentials passphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    /**
     * The passphrase to decrypt the private key in case it is encrypted. Empty if the private key is not encrypted.
     * 
     * @return passphrase
     **/
    @ApiModelProperty(example = "helloworld",
                      value = "The passphrase to decrypt the private key in case it is encrypted. Empty if the private key is not encrypted. ")
    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public GlobalSignCredentials privateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * The private key that matches the client certificate to allow HTTPS connection over TLS/SSL. The private key may
     * be encrypted using a symmetric encryption key derived from a passphrase. The private key must be in PEM format.
     * 
     * @return privateKey
     **/
    @ApiModelProperty(example = "\"-----BEGIN RSA PRIVATE KEY-----\\nProc-Type: 4,ENCRYPTED\\nDEK-Info: DES-EDE3-CBC,CCAC26A4133947CB\\n\\np3KJ4FI3wcz3I0MtiLkrznkjWFvprVmoNywySUGb5IqZViJZqCMEsyU9a9iDsSfP\\nZ07cg9GviV21WYIPSxZOQrpy1g1VWILzFnH+J6z8dSH4mxXh0PwdOzYgAeqkrIVM\\nJ7KRm6t222dZFjjXK3eEcLmBLGo29XwVJxKHx+l4++gU1LZmeHZR5M8fJ4jejUly\\n7sqzPlmRF0N3I4lwKVj+PfQTVz43QoCnpxOjuSEL4liBrc2agY2xH1O0PFyHimz9\\n3XM9HR/iuPHW0N2D+NPjXlWKacerupH9d4i9IYIagzB+HTgej8limdo03GmmxcZ6\\nYNa58n5yQSaqu0TPRU9DsrKeGjadHTlZQGdzfq1SWsROCnHLrXFKE2ozIG3+hxA5\\nujBF/QWpX5+inXUwDJhBxp8isHbPEnBEUUd6ZRzCTjvN0jaUti5B9yFhO2G6mbE8\\nCvhyzQK8oJqsjZXnlcpPf95LP+9XbcCDjLSIaWJstzXO9tPiv6+x1MVWmivtRHcC\\nSTzpx8jAGCiG6ejLqWB87ZXiZm7ujlCBheHSf5RHwNHhUvoP2JEYalDDRxjcDMSx\\n4uV42Np4yJlIQEDlGHcBlXoL7vEukFpuWgkYdpcZy/Ou9qz8mXrpLcu8C8MhLmSC\\nixGoR5iRhV7cxoHLyuCzj87eYEA73Xu238DQorSEEuiVFnLzQ2+PJMs4qoI14q/L\\notlBDz+Ko6DrU/EZROYmiqMkLKXR2sx9zNAJwPYRs6nSH08tZ3dwqzZbgtP3Wazi\\nhLWHt5/En7wQRA5a+/dDEHXSoLvvSQ9jvhclhWf+eCYuq2eH+g54oyJGRSY+8GV7\\nujhLxkzl/3OZdhZPWoz4U13KpbSTcNWu5Y7oGDoabw19UbvqmLf1PJkpDH/tQgzB\\nxYtsLBRUcofpYoeIiIxfAA4do5WilJc8xqrGhkE4WcHfY24HXAiOvsjbxV+BRprX\\n1jtgJpV/9nJESMap+8PxipGUFRGjB83/uwJaa6mLftEKflX8i4MZ+HnqraXERsqA\\nWRUcDHIWmFfpzIB3iNuxawVvPH8NdCSPmQ9qTb8Cozl0AuOK2E9S+ke8oiYQScWR\\nLdu+zhej7GjuQ9R+Ub+wPWqvOA5qLXejqnCexVScDUuN+z9JWM3N2FG1MwxhAzhP\\ndEfoQHoBn6uyOmrVGP6fosV3chqhPoec42KeOAm1xDvx692isaIy1jPgIyPxeqhm\\n2Tw4E+02R7dlP8Ljf7JzfLm4oKpWHWlcHeqg24x6lY/wXU1RBcWaTa0AQUwoGm2m\\nIQCPfIqOEv/QC2HpO7SVCYkl65KwR0oTd1AzYxdxEq3xHQbh69EL0FGZPVxVCPI+\\nhEAyifKy1/tm3l91Rf/kGpHY7nIQKCXH49tmFwix8gke2nZJmRgX7/zAdMOAKeKH\\nAaIl4nQtv14EbaasMgnn9qgaDYnWzaReEob2QlQ/WYlTor61+KFpGtcf9jAkgudT\\n2op+4CF7wT2+aTXdtkVWfmv++iB8GnlqZdxLvyG1cTYjjYHVFbMSWQnxzQqiE2ms\\nQgp+byjWCumpsWTMdTO+d9NkDOo80vDpaRxEgebmhJ0MbX+eFjBgVg==\\n-----END RSA PRIVATE KEY-----\"",
                      required = true,
                      value = "The private key that matches the client certificate to allow HTTPS connection over TLS/SSL. The private key may be encrypted using a symmetric encryption key derived from a passphrase. The private key must be in PEM format. ")
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalSignCredentials globalSignCredentials = (GlobalSignCredentials) o;
        return Objects.equals(this.apiKey, globalSignCredentials.apiKey)
               && Objects.equals(this.apiSecret, globalSignCredentials.apiSecret)
               && Objects.equals(this.clientCertificate, globalSignCredentials.clientCertificate)
               && Objects.equals(this.passphrase, globalSignCredentials.passphrase)
               && Objects.equals(this.privateKey, globalSignCredentials.privateKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKey, apiSecret, clientCertificate, passphrase, privateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalSignCredentials {\n");

        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
        sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
        sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
