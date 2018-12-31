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
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.UpdateCampaign;
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
 * UpdateCampaignPage
 */

public class UpdateCampaignPage implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("after")
  private String after = null;

  @SerializedName("data")
  private List<UpdateCampaign> data = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("object")
  private String object = null;

  /**
   * The order of the records to return. Acceptable values: ASC, DESC. Default: ASC
   */
  @JsonAdapter(OrderEnum.Adapter.class)
  public enum OrderEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderEnum fromValue(String text) {
      for (OrderEnum b : OrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("order")
  private OrderEnum order = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  public UpdateCampaignPage after(String after) {
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @ApiModelProperty(value = "")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public UpdateCampaignPage data(List<UpdateCampaign> data) {
    this.data = data;
    return this;
  }

  public UpdateCampaignPage addDataItem(UpdateCampaign dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<UpdateCampaign>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "\"[]\"", value = "")
  public List<UpdateCampaign> getData() {
    return data;
  }

  public void setData(List<UpdateCampaign> data) {
    this.data = data;
  }

  public UpdateCampaignPage hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public UpdateCampaignPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public UpdateCampaignPage object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(example = "list", value = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public UpdateCampaignPage order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * The order of the records to return. Acceptable values: ASC, DESC. Default: ASC
   * @return order
  **/
  @ApiModelProperty(example = "ASC", value = "The order of the records to return. Acceptable values: ASC, DESC. Default: ASC")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public UpdateCampaignPage totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaignPage updateCampaignPage = (UpdateCampaignPage) o;
    return Objects.equals(this.after, updateCampaignPage.after) &&
        Objects.equals(this.data, updateCampaignPage.data) &&
        Objects.equals(this.hasMore, updateCampaignPage.hasMore) &&
        Objects.equals(this.limit, updateCampaignPage.limit) &&
        Objects.equals(this.object, updateCampaignPage.object) &&
        Objects.equals(this.order, updateCampaignPage.order) &&
        Objects.equals(this.totalCount, updateCampaignPage.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, data, hasMore, limit, object, order, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignPage {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

