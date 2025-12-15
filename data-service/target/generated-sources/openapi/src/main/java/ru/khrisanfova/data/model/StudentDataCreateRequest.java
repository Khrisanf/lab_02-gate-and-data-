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
 * StudentDataCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-24T18:14:13.478953900+03:00[Europe/Moscow]", comments = "Generator version: 7.15.0")
public class StudentDataCreateRequest {

  private String fullName;

  private String passport;

  public StudentDataCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StudentDataCreateRequest(String fullName, String passport) {
    this.fullName = fullName;
    this.passport = passport;
  }

  public StudentDataCreateRequest fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * ФИО студента
   * @return fullName
   */
  @NotNull 
  @Schema(name = "fullName", description = "ФИО студента", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public StudentDataCreateRequest passport(String passport) {
    this.passport = passport;
    return this;
  }

  /**
   * Серия и номер паспорта студента
   * @return passport
   */
  @NotNull 
  @Schema(name = "passport", description = "Серия и номер паспорта студента", requiredMode = Schema.RequiredMode.REQUIRED)
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
    StudentDataCreateRequest studentDataCreateRequest = (StudentDataCreateRequest) o;
    return Objects.equals(this.fullName, studentDataCreateRequest.fullName) &&
        Objects.equals(this.passport, studentDataCreateRequest.passport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, passport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDataCreateRequest {\n");
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

