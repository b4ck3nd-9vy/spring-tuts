package com.example.springrest.restmvc;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "app.config")
public class AppConfig {

  private String name;
  private List<String> userRoles;
  private String message;
  private Map<String, String> map;

}
