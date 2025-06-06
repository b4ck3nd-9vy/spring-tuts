package com.example.springrest.restmvc.config;

import com.example.springrest.restmvc.entity.HostInfo;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding  // Marks this as a binder for @ConfigurationProperties
public class HostInfoConverter implements Converter<String, HostInfo> {

  @Override
  public HostInfo convert(String source) {
    String[] parts = source.split(":");
    return new HostInfo(parts[0], Integer.parseInt(parts[1]));
  }
}
