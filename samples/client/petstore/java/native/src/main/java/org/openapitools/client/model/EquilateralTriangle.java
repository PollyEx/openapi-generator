/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * EquilateralTriangle
 */
@JsonPropertyOrder({
  EquilateralTriangle.JSON_PROPERTY_SHAPE_TYPE,
  EquilateralTriangle.JSON_PROPERTY_TRIANGLE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class EquilateralTriangle {
  public static final String JSON_PROPERTY_SHAPE_TYPE = "shapeType";
  private String shapeType;

  public static final String JSON_PROPERTY_TRIANGLE_TYPE = "triangleType";
  private String triangleType;

  public EquilateralTriangle() { 
  }

  public EquilateralTriangle shapeType(String shapeType) {
    this.shapeType = shapeType;
    return this;
  }

  /**
   * Get shapeType
   * @return shapeType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHAPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getShapeType() {
    return shapeType;
  }


  @JsonProperty(JSON_PROPERTY_SHAPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShapeType(String shapeType) {
    this.shapeType = shapeType;
  }


  public EquilateralTriangle triangleType(String triangleType) {
    this.triangleType = triangleType;
    return this;
  }

  /**
   * Get triangleType
   * @return triangleType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRIANGLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTriangleType() {
    return triangleType;
  }


  @JsonProperty(JSON_PROPERTY_TRIANGLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTriangleType(String triangleType) {
    this.triangleType = triangleType;
  }


  /**
   * Return true if this EquilateralTriangle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquilateralTriangle equilateralTriangle = (EquilateralTriangle) o;
    return Objects.equals(this.shapeType, equilateralTriangle.shapeType) &&
        Objects.equals(this.triangleType, equilateralTriangle.triangleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shapeType, triangleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquilateralTriangle {\n");
    sb.append("    shapeType: ").append(toIndentedString(shapeType)).append("\n");
    sb.append("    triangleType: ").append(toIndentedString(triangleType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `shapeType` to the URL query string
    if (getShapeType() != null) {
      joiner.add(String.format("%sshapeType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getShapeType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `triangleType` to the URL query string
    if (getTriangleType() != null) {
      joiner.add(String.format("%striangleType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTriangleType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }

    public static class Builder {

    private EquilateralTriangle instance;

    public Builder() {
      this(new EquilateralTriangle());
    }

    protected Builder(EquilateralTriangle instance) {
      this.instance = instance;
    }

    public EquilateralTriangle.Builder shapeType(String shapeType) {
      this.instance.shapeType = shapeType;
      return this;
    }
    public EquilateralTriangle.Builder triangleType(String triangleType) {
      this.instance.triangleType = triangleType;
      return this;
    }


    /**
    * returns a built EquilateralTriangle instance.
    *
    * The builder is not reusable.
    */
    public EquilateralTriangle build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static EquilateralTriangle.Builder builder() {
    return new EquilateralTriangle.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public EquilateralTriangle.Builder toBuilder() {
    return new EquilateralTriangle.Builder()
      .shapeType(getShapeType())
      .triangleType(getTriangleType());
  }

}

