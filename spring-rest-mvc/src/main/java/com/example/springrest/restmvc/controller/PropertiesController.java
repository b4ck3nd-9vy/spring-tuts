package com.example.springrest.restmvc.controller;

import com.example.springrest.restmvc.config.AppConfig;
import com.example.springrest.restmvc.config.CustomConfig;
import com.example.springrest.restmvc.config.ProfileConfig;
import com.example.springrest.restmvc.config.RandomConfig;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PropertiesController {

  private final AppConfig appConfig;
  private final CustomConfig customConfig;
  private final RandomConfig randomConfig;
  private final ProfileConfig profileConfig;

  @Value("${app.encoding}")
  private String appEncoding;

  @Value("${app.java.version}")
  private String appJavaVersion;

  @Value("${app.config.custom-message}")
  private String customMessage;

  @PostConstruct
  public void printMessage() {
    log.info(customConfig.getWelcomeMessage());
  }

  @GetMapping("/appInfo")
  public String appInfo() {
    return String.format("App Encoding: %s, Java Version: %s", appEncoding, appJavaVersion);
  }

  @GetMapping("/appMessage")
  public String appMessage() {
    return customMessage;
  }

  @GetMapping("/appConfig")
  public AppConfig appConfig() {
    return appConfig;
  }

  @GetMapping("/customConfig")
  public CustomConfig customConfig() {
    return customConfig;
  }

  @GetMapping("/randomConfig")
  public RandomConfig randomConfig() {
    return randomConfig;
  }

  @GetMapping("/profileConfig")
  public String nameFromProfileConfig() {
    return profileConfig.getName();
  }

}
