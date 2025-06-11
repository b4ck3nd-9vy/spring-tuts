package com.example.springrest.restmvc.config;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase;

public class CustomNamingStrategy extends NamingBase {

  @Override
  public String translate(String propertyName) {
    // Convert to snake_case, then uppercase
    String snake = PropertyNamingStrategies.SnakeCaseStrategy.INSTANCE.translate(propertyName);
    return snake != null ? snake.toUpperCase() : null;
  }
}
