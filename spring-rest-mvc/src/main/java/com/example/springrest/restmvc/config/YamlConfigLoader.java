package com.example.springrest.restmvc.config;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;

public class YamlConfigLoader implements EnvironmentPostProcessor {

  private final YamlPropertySourceLoader loader = new YamlPropertySourceLoader();

  @Override
  public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
    Resource path = new ClassPathResource("custom.yml");
    PropertySource<?> propertySource = loadYaml(path);
    environment.getPropertySources().addLast(propertySource);
  }

  private PropertySource<?> loadYaml(Resource path) {
    Assert.isTrue(path.exists(), () -> "'path' [%s] must exist".formatted(path));
    try {
      return this.loader.load("custom-resource", path).getFirst();
    }
    catch (IOException ex) {
      throw new IllegalStateException("Failed to load yaml configuration from " + path, ex);
    }
  }
}
