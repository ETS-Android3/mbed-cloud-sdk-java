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
 * This object is used when creating new groups.
 */
@ApiModel(description = "This object is used when creating new groups.")

public class GroupCreationInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("members")
    private SubjectList members = null;

    @SerializedName("name")
    private String name = null;

    public GroupCreationInfo members(SubjectList members) {
        this.members = members;
        return this;
    }

    /**
     * The members of the group as arrays of user and API key IDs.
     * 
     * @return members
     **/
    @ApiModelProperty(value = "The members of the group as arrays of user and API key IDs.")
    public SubjectList getMembers() {
        return members;
    }

    public void setMembers(SubjectList members) {
        this.members = members;
    }

    public GroupCreationInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The group name, not longer than 100 characters.
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "The group name, not longer than 100 characters.")
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
        GroupCreationInfo groupCreationInfo = (GroupCreationInfo) o;
        return Objects.equals(this.members, groupCreationInfo.members)
               && Objects.equals(this.name, groupCreationInfo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupCreationInfo {\n");

        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
