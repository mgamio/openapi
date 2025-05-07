package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorDetail
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-16T13:14:05.797687427Z[GMT]")


public class ErrorDetail   {
  @JsonProperty("title")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String title = null;

  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer status = null;

  @JsonProperty("detail")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String detail = null;

  @JsonProperty("path")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String path = null;

  @JsonProperty("timeStamp")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Long timeStamp = null;


  public ErrorDetail title(String title) { 

    this.title = title;
    return this;
  }

  /**
   * a short, human-readable summary of the problem .
   * @return title
   **/
  
  @Schema(example = " Bad Request", description = "a short, human-readable summary of the problem .")
  
  public String getTitle() {  
    return title;
  }



  public void setTitle(String title) { 
    this.title = title;
  }

  public ErrorDetail status(Integer status) { 

    this.status = status;
    return this;
  }

  /**
   * the HTTP status code applicable to this problem.
   * @return status
   **/
  
  @Schema(example = "400", description = "the HTTP status code applicable to this problem.")
  
  public Integer getStatus() {  
    return status;
  }



  public void setStatus(Integer status) { 
    this.status = status;
  }

  public ErrorDetail detail(String detail) { 

    this.detail = detail;
    return this;
  }

  /**
   * a human-readable explanation specific to this occurrence of the problem.
   * @return detail
   **/
  
  @Schema(example = "parameter 'principal' invalid", description = "a human-readable explanation specific to this occurrence of the problem.")
  
  public String getDetail() {  
    return detail;
  }



  public void setDetail(String detail) { 
    this.detail = detail;
  }

  public ErrorDetail path(String path) { 

    this.path = path;
    return this;
  }

  /**
   * a pointer to the value in the request document that caused the error.
   * @return path
   **/
  
  @Schema(example = "/api/v1/timeValueOfMoney/simpleInterest", description = "a pointer to the value in the request document that caused the error.")
  
  public String getPath() {  
    return path;
  }



  public void setPath(String path) { 
    this.path = path;
  }

  public ErrorDetail timeStamp(Long timeStamp) { 

    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * TimeStamp.
   * @return timeStamp
   **/
  
  @Schema(example = "1687508256614", description = "TimeStamp.")
  
  public Long getTimeStamp() {  
    return timeStamp;
  }



  public void setTimeStamp(Long timeStamp) { 
    this.timeStamp = timeStamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.title, errorDetail.title) &&
        Objects.equals(this.status, errorDetail.status) &&
        Objects.equals(this.detail, errorDetail.detail) &&
        Objects.equals(this.path, errorDetail.path) &&
        Objects.equals(this.timeStamp, errorDetail.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, status, detail, path, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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
