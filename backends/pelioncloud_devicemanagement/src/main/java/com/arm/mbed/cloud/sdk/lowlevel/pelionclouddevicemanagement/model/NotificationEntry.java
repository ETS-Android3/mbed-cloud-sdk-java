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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Represents an account notification entry.
 */
@ApiModel(description = "Represents an account notification entry.")

public class NotificationEntry implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("account_id")
    private String accountId = null;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("error_msg")
    private String errorMsg = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("message")
    private String message = null;

    /**
     * Entity name: always &#39;notification-entry&#39;
     */
    @JsonAdapter(ObjectEnum.Adapter.class)
    public enum ObjectEnum {
        ENTRY("notification-entry");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ObjectEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ObjectEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ObjectEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("object")
    private ObjectEnum object = null;

    @SerializedName("receiver")
    private String receiver = null;

    @SerializedName("subject")
    private String subject = null;

    @SerializedName("success")
    private Boolean success = null;

    @SerializedName("type")
    private String type = null;

    public NotificationEntry accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The ID of the account.
     * 
     * @return accountId
     **/
    @ApiModelProperty(example = "01619571e2e90242ac12000600000000", value = "The ID of the account.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public NotificationEntry createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Creation UTC time RFC3339.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2018-02-13T09:35:20Z", value = "Creation UTC time RFC3339.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NotificationEntry errorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * The error message if there was an error while transmitting the account notification.
     * 
     * @return errorMsg
     **/
    @ApiModelProperty(example = "Connection error.",
                      value = "The error message if there was an error while transmitting the account notification.")
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public NotificationEntry etag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * API resource entity version.
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "1", required = true, value = "API resource entity version.")
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public NotificationEntry id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Entity ID.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "01619571d01d0242ac12000600000000", required = true, value = "Entity ID.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NotificationEntry message(String message) {
        this.message = message;
        return this;
    }

    /**
     * The message contained in this account notification entry.
     * 
     * @return message
     **/
    @ApiModelProperty(example = "User limit has been reached.",
                      value = "The message contained in this account notification entry.")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NotificationEntry object(ObjectEnum object) {
        this.object = object;
        return this;
    }

    /**
     * Entity name: always &#39;notification-entry&#39;
     * 
     * @return object
     **/
    @ApiModelProperty(required = true, value = "Entity name: always 'notification-entry'")
    public ObjectEnum getObject() {
        return object;
    }

    public void setObject(ObjectEnum object) {
        this.object = object;
    }

    public NotificationEntry receiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    /**
     * The receiver this account notification entry.
     * 
     * @return receiver
     **/
    @ApiModelProperty(example = "example@email-receiver.test", value = "The receiver this account notification entry.")
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public NotificationEntry subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * The subject of this account notification entry.
     * 
     * @return subject
     **/
    @ApiModelProperty(example = "Account locked.", value = "The subject of this account notification entry.")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public NotificationEntry success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * A flag indiciating whether the sending of this account notification entry was successful, true or false.
     * 
     * @return success
     **/
    @ApiModelProperty(value = "A flag indiciating whether the sending of this account notification entry was successful, true or false.")
    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public NotificationEntry type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of this account notification entry.
     * 
     * @return type
     **/
    @ApiModelProperty(example = "email", value = "The type of this account notification entry.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
        NotificationEntry notificationEntry = (NotificationEntry) o;
        return Objects.equals(this.accountId, notificationEntry.accountId)
               && Objects.equals(this.createdAt, notificationEntry.createdAt)
               && Objects.equals(this.errorMsg, notificationEntry.errorMsg)
               && Objects.equals(this.etag, notificationEntry.etag) && Objects.equals(this.id, notificationEntry.id)
               && Objects.equals(this.message, notificationEntry.message)
               && Objects.equals(this.object, notificationEntry.object)
               && Objects.equals(this.receiver, notificationEntry.receiver)
               && Objects.equals(this.subject, notificationEntry.subject)
               && Objects.equals(this.success, notificationEntry.success)
               && Objects.equals(this.type, notificationEntry.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, createdAt, errorMsg, etag, id, message, object, receiver, subject, success,
                            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationEntry {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
