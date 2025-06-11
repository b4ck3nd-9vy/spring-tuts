package com.example.springrest.restmvc.entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonPropertyOrder({"name", "snakeCase", "camelCase", "duration"})
public class SimpleEntity {

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private String name;
  private Duration duration;
  private LocalDateTime localDateTime;
  private ZonedDateTime zonedDateTime;
  @JsonFormat(pattern = "dd.MM.yyyy")
  private LocalDate localDate;
  @JsonFormat(pattern = "HH:mm:ss")
  private LocalTime localTime;
  @JsonIgnore
  private String secret;
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> stringList;
  private Map<String, Object> map;
  private StatusEnum status;

  @JsonProperty("snake_case")
  private SnakeCaseEntity snakeCase;

  @JsonProperty("CamelCase")
  private CamelCaseEntity camelCase;

  public static SimpleEntity of(String name, String duration) {
    return new SimpleEntity(name, Duration.parse(duration),
        LocalDateTime.now(), ZonedDateTime.now(), LocalDate.now(), LocalTime.now(),
        "secret-message", Collections.emptyList(), new HashMap<>(), StatusEnum.ACTIVE,
        new SnakeCaseEntity(name, name), new  CamelCaseEntity(name, name));
  }

  @JsonAnySetter
  public void add(String key, Object value) {
    map.put(key, value);
  }

  @Getter
  @Setter
  @AllArgsConstructor
  @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
  public static class SnakeCaseEntity {
    private String firstName;
    private String lastName;
  }

  @Getter
  @Setter
  @AllArgsConstructor
  @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
  public static class CamelCaseEntity {
    private String firstName;
    private String lastName;
  }

  public enum StatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive"),
    ;

    private final String code;

    StatusEnum(String code) {
      this.code = code;
    }

    @JsonValue
    public String getCode() {
      return code;
    }
  }

}
