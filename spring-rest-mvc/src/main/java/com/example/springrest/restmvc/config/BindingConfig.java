package com.example.springrest.restmvc.config;

import com.example.springrest.restmvc.config.legacy.HostInfoEditor;
import com.example.springrest.restmvc.entity.HostInfo;
import com.example.springrest.restmvc.entity.HostInfoLegacy;
import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
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

  // Legacy way to bind custom type for properties
  @Bean
  public static CustomEditorConfigurer customEditorConfigurer() {
    CustomEditorConfigurer configurer = new CustomEditorConfigurer();
    Map<Class<?>, Class<? extends PropertyEditor>> editors = new HashMap<>();
    editors.put(HostInfoLegacy.class, HostInfoEditor.class);
    configurer.setCustomEditors(editors);
    return configurer;
  }
}
