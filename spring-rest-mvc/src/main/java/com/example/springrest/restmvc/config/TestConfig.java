package com.example.springrest.restmvc.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Getter
@Setter
@Configuration
@Profile("test")
public class TestConfig implements ProfileConfig {

  @Value("${name}")
  private String name;

}
