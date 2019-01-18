/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-03T13:54:47.084-08:00")
public class DatasourceField {
  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("FieldGroup")
  private String fieldGroup = null;

  public DatasourceField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 
   * @return fieldName
  **/
  @ApiModelProperty(value = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public DatasourceField status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DatasourceField fieldGroup(String fieldGroup) {
    this.fieldGroup = fieldGroup;
    return this;
  }

   /**
   * 
   * @return fieldGroup
  **/
  @ApiModelProperty(value = "")
  public String getFieldGroup() {
    return fieldGroup;
  }

  public void setFieldGroup(String fieldGroup) {
    this.fieldGroup = fieldGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasourceField datasourceField = (DatasourceField) o;
    return Objects.equals(this.fieldName, datasourceField.fieldName) &&
        Objects.equals(this.status, datasourceField.status) &&
        Objects.equals(this.fieldGroup, datasourceField.fieldGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, status, fieldGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasourceField {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fieldGroup: ").append(toIndentedString(fieldGroup)).append("\n");
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

