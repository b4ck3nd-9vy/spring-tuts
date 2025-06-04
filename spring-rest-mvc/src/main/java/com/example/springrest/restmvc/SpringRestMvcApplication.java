package com.example.springrest.restmvc;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppConfig.class, RandomConfig.class})
public class SpringRestMvcApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(SpringRestMvcApplication.class);

    Map<String, Object> defaults = new HashMap<>();
    defaults.put("app.config.message", "Default message"); // override by LateConfig
    app.setDefaultProperties(defaults);

    app.run(args);
  }

}
