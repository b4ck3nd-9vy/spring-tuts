package com.example.springrest.restmvc.config;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@RequiredArgsConstructor
@Slf4j
public class CryptedConfigParser {

  private final CryptedConfig cryptedConfig;

  private String secret;

  @PostConstruct
  public void init() {
    try {
      setSecret(new String(cryptedConfig.getSecret().getInputStream().readAllBytes(), StandardCharsets.UTF_8));
    } catch (IOException e) {
      log.error("Error reading crypted secret", e);
      setSecret(null);
    }
  }
}
