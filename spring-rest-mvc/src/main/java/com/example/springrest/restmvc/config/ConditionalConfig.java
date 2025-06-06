package com.example.springrest.restmvc.config;

import com.example.springrest.restmvc.entity.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ConditionalConfig {

  @Bean
  @ConditionalOnBean(DevConfig.class)
  public Person developer(DevConfig config) {
    return new Person(config.getName());
  }

  @Bean
  @ConditionalOnBean(TestConfig.class)
  public Person tester(TestConfig config) {
    return new Person(config.getName());
  }

}
