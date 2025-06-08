package com.example.springrest.restmvc.config;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

@Getter
@Setter
@ConfigurationProperties(prefix = "my.crypted")
public class CryptedConfig {

  private Resource secret;

  @Override
  public String toString() {
    try {
      return new String(secret.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
