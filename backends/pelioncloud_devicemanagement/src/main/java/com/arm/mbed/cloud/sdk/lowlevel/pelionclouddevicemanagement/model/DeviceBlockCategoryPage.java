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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * DeviceBlockCategoryPage
 */

public class DeviceBlockCategoryPage implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("after")
    private String after = null;

    @SerializedName("data")
    private List<DeviceBlockCategory> data = null;

    @SerializedName("has_more")
    private Boolean hasMore = null;

    @SerializedName("limit")
    private Integer limit = null;

    @SerializedName("object")
    private String object = null;

    @SerializedName("order")
    private String order = null;

    @SerializedName("total_count")
    private Integer totalCount = null;

    public DeviceBlockCategoryPage after(String after) {
        this.after = after;
        return this;
    }

    /**
     * An offset token for current page.
     * 
     * @return after
     **/
    @ApiModelProperty(value = "An offset token for current page.")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public DeviceBlockCategoryPage data(List<DeviceBlockCategory> data) {
        this.data = data;
        return this;
    }

    public DeviceBlockCategoryPage addDataItem(DeviceBlockCategory dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<DeviceBlockCategory>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * 
     * @return data
     **/
    @ApiModelProperty(value = "")
    public List<DeviceBlockCategory> getData() {
        return data;
    }

    public void setData(List<DeviceBlockCategory> data) {
        this.data = data;
    }

    public DeviceBlockCategoryPage hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Are there more results available.
     * 
     * @return hasMore
     **/
    @ApiModelProperty(example = "false", value = "Are there more results available.")
    public Boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public DeviceBlockCategoryPage limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * How many objects to retrieve in the page. The minimum limit is 2 and the maximum is 1000. Limit values outside of
     * this range are set to the closest limit. minimum: 2 maximum: 1000
     * 
     * @return limit
     **/
    @ApiModelProperty(example = "50",
                      value = "How many objects to retrieve in the page. The minimum limit is 2 and the maximum is 1000. Limit values outside of this range are set to the closest limit.")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public DeviceBlockCategoryPage object(String object) {
        this.object = object;
        return this;
    }

    /**
     * The type of this API object is a \&quot;list\&quot;.
     * 
     * @return object
     **/
    @ApiModelProperty(example = "list", value = "The type of this API object is a \"list\".")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public DeviceBlockCategoryPage order(String order) {
        this.order = order;
        return this;
    }

    /**
     * The creation time based order of the entries.
     * 
     * @return order
     **/
    @ApiModelProperty(example = "DESC", value = "The creation time based order of the entries.")
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public DeviceBlockCategoryPage totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * 
     * @return totalCount
     **/
    @ApiModelProperty(example = "1", value = "")
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
        DeviceBlockCategoryPage deviceBlockCategoryPage = (DeviceBlockCategoryPage) o;
        return Objects.equals(this.after, deviceBlockCategoryPage.after)
               && Objects.equals(this.data, deviceBlockCategoryPage.data)
               && Objects.equals(this.hasMore, deviceBlockCategoryPage.hasMore)
               && Objects.equals(this.limit, deviceBlockCategoryPage.limit)
               && Objects.equals(this.object, deviceBlockCategoryPage.object)
               && Objects.equals(this.order, deviceBlockCategoryPage.order)
               && Objects.equals(this.totalCount, deviceBlockCategoryPage.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, data, hasMore, limit, object, order, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceBlockCategoryPage {\n");

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
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
