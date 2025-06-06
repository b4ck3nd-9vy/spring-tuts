package com.example.springrest.restmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration(proxyBeanMethods = false)
public class BindingConfig {

  @Bean(name = "conversionService")
  public ConversionService conversionService() {
    DefaultConversionService service = new DefaultConversionService();
    service.addConverter(new HostInfoConverter());
    return service;
  }

}
