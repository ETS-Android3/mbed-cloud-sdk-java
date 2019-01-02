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
import java.io.Serializable;

/**
 * AsyncID
 */

public class AsyncID implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("async-response-id")
    private String asyncResponseId = null;

    public AsyncID asyncResponseId(String asyncResponseId) {
        this.asyncResponseId = asyncResponseId;
        return this;
    }

    /**
     * Asynchronous response unique ID.
     * 
     * @return asyncResponseId
     **/
    @ApiModelProperty(example = "9e3c96b8-c4d7-496a-ab90-cc732b9b560e", value = "Asynchronous response unique ID.")
    public String getAsyncResponseId() {
        return asyncResponseId;
    }

    public void setAsyncResponseId(String asyncResponseId) {
        this.asyncResponseId = asyncResponseId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AsyncID asyncID = (AsyncID) o;
        return Objects.equals(this.asyncResponseId, asyncID.asyncResponseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asyncResponseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncID {\n");

        sb.append("    asyncResponseId: ").append(toIndentedString(asyncResponseId)).append("\n");
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
