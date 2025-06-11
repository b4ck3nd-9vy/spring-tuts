package com.example.springrest.restmvc.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.Duration;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SimpleEntity {

  private String name;
  private Duration duration;
  private LocalDateTime localDateTime;

  @JsonProperty("snake_case")
  private SnakeCaseEntity snakeCase;

  @JsonProperty("CamelCase")
  private CamelCaseEntity camelCase;

  public static SimpleEntity of(String name, String duration) {
    return new SimpleEntity(name, Duration.parse(duration),  LocalDateTime.now(),
        new SnakeCaseEntity(name, name), new  CamelCaseEntity(name, name));
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

}
