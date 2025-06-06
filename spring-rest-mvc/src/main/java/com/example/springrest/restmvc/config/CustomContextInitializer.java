package com.example.springrest.restmvc.config;

import java.util.Properties;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.PropertiesPropertySource;

public class CustomContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

  @Override
  public void initialize(ConfigurableApplicationContext ctx) {
    Properties props = new Properties();
    props.put("app.config.early-message", "This is early-injected message.");
    ctx.getEnvironment().getPropertySources().addFirst(new PropertiesPropertySource("customInitializerProps", props));
  }
}
