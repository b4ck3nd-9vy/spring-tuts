package com.example.springrest.restmvc.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration(proxyBeanMethods = false)
public class ObjectMapperConfig {

  @Bean
  @ConditionalOnMissingBean(ObjectMapper.class)
  public ObjectMapper defaultObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.setPropertyNamingStrategy(new CustomNamingStrategy());
    return objectMapper;
  }

  @Bean
  @Primary
  @Profile("dev")
  public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
    ObjectMapper objectMapper = builder.build();
    //objectMapper.registerModule(new JavaTimeModule());
    return objectMapper;
  }

  @Bean
  @Profile("dev")
  public Jackson2ObjectMapperBuilderCustomizer customizer() {
      return builder -> builder.modules(new JavaTimeModule());
  }

}
