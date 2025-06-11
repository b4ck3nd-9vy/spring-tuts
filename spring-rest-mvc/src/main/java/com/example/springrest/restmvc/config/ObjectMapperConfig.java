package com.example.springrest.restmvc.config;

import com.example.springrest.restmvc.config.CustomJsonComponent.Deserializer;
import com.example.springrest.restmvc.config.CustomJsonComponent.Serializer;
import com.example.springrest.restmvc.entity.ComplexEntity;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
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
    SimpleModule module = new SimpleModule();
    module.addSerializer(ComplexEntity.class, new Serializer());
    module.addDeserializer(ComplexEntity.class, new Deserializer());

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.registerModule(module);
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
    SimpleModule module = new SimpleModule();
    module.addSerializer(ComplexEntity.class, new CustomJsonSerializer());
    module.addDeserializer(ComplexEntity.class, new CustomJsonDeserializer());
    return builder -> builder.modules(new JavaTimeModule(), module);
  }

}
