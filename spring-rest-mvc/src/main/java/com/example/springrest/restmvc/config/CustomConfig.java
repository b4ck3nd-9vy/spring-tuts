package com.example.springrest.restmvc.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "custom")
public class CustomConfig {

  private String welcomeMessage;

}
