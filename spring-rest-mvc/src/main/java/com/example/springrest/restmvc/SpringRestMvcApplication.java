package com.example.springrest.restmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppConfig.class, RandomConfig.class, CustomConfig.class})
public class SpringRestMvcApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringRestMvcApplication.class, args);
  }

}
