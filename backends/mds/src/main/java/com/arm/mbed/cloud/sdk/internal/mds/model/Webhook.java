/*
 * Connect API
 * Mbed Cloud Connect API allows web applications to communicate with devices. You can subscribe to device resources and read/write values to them. Mbed Cloud Connect makes connectivity to devices easy by queuing requests and caching resource values.
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.mds.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * Webhook
 */

public class Webhook implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("url")
  private String url = null;

  @SerializedName("headers")
  private Map<String, String> headers = null;

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL to which the notifications are sent. We recommend that you serve this URL over HTTPS.
   * @return url
  **/
  @ApiModelProperty(example = "https://www.example.com/my-webhook", required = true, value = "The URL to which the notifications are sent. We recommend that you serve this URL over HTTPS.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Webhook headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public Webhook putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * The headers (key/value) sent with the notification. Optional.
   * @return headers
  **/
  @ApiModelProperty(example = "\"{\\\"authorization\\\" : \\\"f4b93d6e-4652-4874-82e4-41a3ced0cd56\\\"}\"", value = "The headers (key/value) sent with the notification. Optional.")
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.headers, webhook.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, headers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

