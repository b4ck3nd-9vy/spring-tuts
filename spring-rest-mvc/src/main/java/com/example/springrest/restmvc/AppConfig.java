package com.example.springrest.restmvc;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "app.config")
public class AppConfig {

  private String name;
  private List<String> userRoles;

}
