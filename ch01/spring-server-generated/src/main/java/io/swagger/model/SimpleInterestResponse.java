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
 * SimpleInterestResponse
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-16T13:14:05.797687427Z[GMT]")


public class SimpleInterestResponse   {
  @JsonProperty("simpleInterest")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer simpleInterest = null;


  public SimpleInterestResponse simpleInterest(Integer simpleInterest) { 

    this.simpleInterest = simpleInterest;
    return this;
  }

  /**
   * simple interest for the requested parameters
   * @return simpleInterest
   **/
  
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "simple interest for the requested parameters")
  
  public Integer getSimpleInterest() {  
    return simpleInterest;
  }



  public void setSimpleInterest(Integer simpleInterest) { 
    this.simpleInterest = simpleInterest;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleInterestResponse simpleInterestResponse = (SimpleInterestResponse) o;
    return Objects.equals(this.simpleInterest, simpleInterestResponse.simpleInterest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simpleInterest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleInterestResponse {\n");
    
    sb.append("    simpleInterest: ").append(toIndentedString(simpleInterest)).append("\n");
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
