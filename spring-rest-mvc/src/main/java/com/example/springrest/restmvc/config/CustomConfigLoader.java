package com.example.springrest.restmvc.config;

import java.io.IOException;
import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

@Configuration
@EnableConfigurationProperties(CustomConfig.class)
public class CustomConfigLoader implements EnvironmentPostProcessor {

  @Override
  public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
    try {
      Resource resource = new ClassPathResource("custom.properties");
      Properties props = PropertiesLoaderUtils.loadProperties(resource);
      PropertySource<?> propertySource = new PropertiesPropertySource("customProps", props);
      environment.getPropertySources().addLast(propertySource);
    } catch (IOException e) {
      throw new RuntimeException("Failed to load custom.properties", e);
    }
  }
}
