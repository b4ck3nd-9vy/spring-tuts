package com.example.springrest.restmvc;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Getter
@Setter
@Configuration
@Profile("dev")
public class DevConfig implements ProfileConfig {

  @Value("${name}")
  private String name;

}
