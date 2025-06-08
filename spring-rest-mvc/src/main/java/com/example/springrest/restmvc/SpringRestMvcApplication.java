package com.example.springrest.restmvc;

import com.example.springrest.restmvc.config.AppConfig;
import com.example.springrest.restmvc.config.ConversionConfig;
import com.example.springrest.restmvc.config.CryptedConfig;
import com.example.springrest.restmvc.config.RandomConfig;
import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppConfig.class, RandomConfig.class, ConversionConfig.class, CryptedConfig.class})
public class SpringRestMvcApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(SpringRestMvcApplication.class);

    Map<String, Object> defaults = new HashMap<>();
    defaults.put("app.config.message", "Default message"); // override by LateConfig
    app.setDefaultProperties(defaults);

    app.run(args);
  }

}
