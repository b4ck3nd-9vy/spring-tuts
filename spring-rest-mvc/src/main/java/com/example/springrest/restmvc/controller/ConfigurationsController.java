package com.example.springrest.restmvc.controller;

import com.example.springrest.restmvc.entity.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ConfigurationsController {

  private final Person person; // no error because of conditional bean declaration

  @GetMapping("/conditionalConfig")
  public String conditionalConfig() {
    return person.name();
  }

}
