package com.example.springrest.restmvc.config;

import com.example.springrest.restmvc.entity.HostInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "my")
public class HostConfig {

  private HostInfo server;

}
