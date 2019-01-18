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
public class DriverLicence {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("State")
  private String state = null;

  @SerializedName("DayOfExpiry")
  private Integer dayOfExpiry = null;

  @SerializedName("MonthOfExpiry")
  private Integer monthOfExpiry = null;

  @SerializedName("YearOfExpiry")
  private Integer yearOfExpiry = null;

  public DriverLicence number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Driver&#39;s Licence Number of the individual to be verified
   * @return number
  **/
  @ApiModelProperty(value = "Driver's Licence Number of the individual to be verified")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DriverLicence state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State of issue for driver&#39;s Licence
   * @return state
  **/
  @ApiModelProperty(value = "State of issue for driver's Licence")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public DriverLicence dayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence day of expiry of the individual to be verified
   * @return dayOfExpiry
  **/
  @ApiModelProperty(value = "Driver's Licence day of expiry of the individual to be verified")
  public Integer getDayOfExpiry() {
    return dayOfExpiry;
  }

  public void setDayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
  }

  public DriverLicence monthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence month of expiry of the individual to be verified
   * @return monthOfExpiry
  **/
  @ApiModelProperty(value = "Driver's Licence month of expiry of the individual to be verified")
  public Integer getMonthOfExpiry() {
    return monthOfExpiry;
  }

  public void setMonthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
  }

  public DriverLicence yearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence year of expiry of the individual to be verified
   * @return yearOfExpiry
  **/
  @ApiModelProperty(value = "Driver's Licence year of expiry of the individual to be verified")
  public Integer getYearOfExpiry() {
    return yearOfExpiry;
  }

  public void setYearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverLicence driverLicence = (DriverLicence) o;
    return Objects.equals(this.number, driverLicence.number) &&
        Objects.equals(this.state, driverLicence.state) &&
        Objects.equals(this.dayOfExpiry, driverLicence.dayOfExpiry) &&
        Objects.equals(this.monthOfExpiry, driverLicence.monthOfExpiry) &&
        Objects.equals(this.yearOfExpiry, driverLicence.yearOfExpiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, state, dayOfExpiry, monthOfExpiry, yearOfExpiry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverLicence {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dayOfExpiry: ").append(toIndentedString(dayOfExpiry)).append("\n");
    sb.append("    monthOfExpiry: ").append(toIndentedString(monthOfExpiry)).append("\n");
    sb.append("    yearOfExpiry: ").append(toIndentedString(yearOfExpiry)).append("\n");
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

