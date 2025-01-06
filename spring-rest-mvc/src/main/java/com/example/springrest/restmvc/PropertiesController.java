package com.example.springrest.restmvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

  @Value("${app.encoding}")
  private String appEncoding;

  @Value("${app.java.version}")
  private String appJavaVersion;

  @GetMapping("/appInfo")
  public String appInfo() {
    return String.format("App Encoding: %s, Java Version: %s", appEncoding, appJavaVersion);
  }

}
