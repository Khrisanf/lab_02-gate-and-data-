package ru.khrisanfova.data.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StudentDataResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T18:14:13.478953900+03:00[Europe/Moscow]", comments = "Generator version: 7.15.0")
public class StudentDataResponse {

  private Long id;

  private String fullName;

  private String passport;

  public StudentDataResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StudentDataResponse(Long id, String fullName, String passport) {
    this.id = id;
    this.fullName = fullName;
    this.passport = passport;
  }

  public StudentDataResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StudentDataResponse fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  @NotNull 
  @Schema(name = "fullName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public StudentDataResponse passport(String passport) {
    this.passport = passport;
    return this;
  }

  /**
   * Get passport
   * @return passport
   */
  @NotNull 
  @Schema(name = "passport", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("passport")
  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDataResponse studentDataResponse = (StudentDataResponse) o;
    return Objects.equals(this.id, studentDataResponse.id) &&
        Objects.equals(this.fullName, studentDataResponse.fullName) &&
        Objects.equals(this.passport, studentDataResponse.passport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName, passport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDataResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
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
}

