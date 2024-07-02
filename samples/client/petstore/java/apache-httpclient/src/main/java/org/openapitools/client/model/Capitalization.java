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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Capitalization
 */
@JsonPropertyOrder({
  Capitalization.JSON_PROPERTY_SMALL_CAMEL,
  Capitalization.JSON_PROPERTY_CAPITAL_CAMEL,
  Capitalization.JSON_PROPERTY_SMALL_SNAKE,
  Capitalization.JSON_PROPERTY_CAPITAL_SNAKE,
  Capitalization.JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS,
  Capitalization.JSON_PROPERTY_A_T_T_N_A_M_E
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class Capitalization {
  public static final String JSON_PROPERTY_SMALL_CAMEL = "smallCamel";
  private String smallCamel;

  public static final String JSON_PROPERTY_CAPITAL_CAMEL = "CapitalCamel";
  private String capitalCamel;

  public static final String JSON_PROPERTY_SMALL_SNAKE = "small_Snake";
  private String smallSnake;

  public static final String JSON_PROPERTY_CAPITAL_SNAKE = "Capital_Snake";
  private String capitalSnake;

  public static final String JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS = "SCA_ETH_Flow_Points";
  private String scAETHFlowPoints;

  public static final String JSON_PROPERTY_A_T_T_N_A_M_E = "ATT_NAME";
  private String ATT_NAME;

  public Capitalization() {
  }

  public Capitalization smallCamel(String smallCamel) {
    
    this.smallCamel = smallCamel;
    return this;
  }

  /**
   * Get smallCamel
   * @return smallCamel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMALL_CAMEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmallCamel() {
    return smallCamel;
  }


  @JsonProperty(JSON_PROPERTY_SMALL_CAMEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

  public Capitalization capitalCamel(String capitalCamel) {
    
    this.capitalCamel = capitalCamel;
    return this;
  }

  /**
   * Get capitalCamel
   * @return capitalCamel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPITAL_CAMEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCapitalCamel() {
    return capitalCamel;
  }


  @JsonProperty(JSON_PROPERTY_CAPITAL_CAMEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  public Capitalization smallSnake(String smallSnake) {
    
    this.smallSnake = smallSnake;
    return this;
  }

  /**
   * Get smallSnake
   * @return smallSnake
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMALL_SNAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmallSnake() {
    return smallSnake;
  }


  @JsonProperty(JSON_PROPERTY_SMALL_SNAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

  public Capitalization capitalSnake(String capitalSnake) {
    
    this.capitalSnake = capitalSnake;
    return this;
  }

  /**
   * Get capitalSnake
   * @return capitalSnake
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPITAL_SNAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCapitalSnake() {
    return capitalSnake;
  }


  @JsonProperty(JSON_PROPERTY_CAPITAL_SNAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  public Capitalization scAETHFlowPoints(String scAETHFlowPoints) {
    
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

  /**
   * Get scAETHFlowPoints
   * @return scAETHFlowPoints
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }


  @JsonProperty(JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  public Capitalization ATT_NAME(String ATT_NAME) {
    
    this.ATT_NAME = ATT_NAME;
    return this;
  }

  /**
   * Name of the pet 
   * @return ATT_NAME
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_A_T_T_N_A_M_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getATTNAME() {
    return ATT_NAME;
  }


  @JsonProperty(JSON_PROPERTY_A_T_T_N_A_M_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(this.smallCamel, capitalization.smallCamel) &&
        Objects.equals(this.capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(this.smallSnake, capitalization.smallSnake) &&
        Objects.equals(this.capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(this.scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(this.ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
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

    // add `smallCamel` to the URL query string
    if (getSmallCamel() != null) {
      try {
        joiner.add(String.format("%ssmallCamel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmallCamel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `CapitalCamel` to the URL query string
    if (getCapitalCamel() != null) {
      try {
        joiner.add(String.format("%sCapitalCamel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCapitalCamel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `small_Snake` to the URL query string
    if (getSmallSnake() != null) {
      try {
        joiner.add(String.format("%ssmall_Snake%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmallSnake()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Capital_Snake` to the URL query string
    if (getCapitalSnake() != null) {
      try {
        joiner.add(String.format("%sCapital_Snake%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCapitalSnake()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `SCA_ETH_Flow_Points` to the URL query string
    if (getScAETHFlowPoints() != null) {
      try {
        joiner.add(String.format("%sSCA_ETH_Flow_Points%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScAETHFlowPoints()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ATT_NAME` to the URL query string
    if (getATTNAME() != null) {
      try {
        joiner.add(String.format("%sATT_NAME%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getATTNAME()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

