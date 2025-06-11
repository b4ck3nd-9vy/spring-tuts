package com.example.springrest.restmvc.controller;

import com.example.springrest.restmvc.entity.AbstractEntity;
import com.example.springrest.restmvc.entity.ComplexEntity;
import com.example.springrest.restmvc.entity.SimpleEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jackson.JsonComponentModule;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
@RequiredArgsConstructor
@Slf4j
public class JsonController {

  private final ObjectMapper objectMapper;

  @GetMapping("/simpleEntity")
  public SimpleEntity simpleEntity() {
    /*
     "PT20.345S" -- parses as "20.345 seconds"
     "PT15M"     -- parses as "15 minutes" (where a minute is 60 seconds)
     "PT10H"     -- parses as "10 hours" (where an hour is 3600 seconds)
     "P2D"       -- parses as "2 days" (where a day is 24 hours or 86400 seconds)
     "P2DT3H4M"  -- parses as "2 days, 3 hours and 4 minutes"
     "PT-6H3M"    -- parses as "-6 hours and +3 minutes"
     "-PT6H3M"    -- parses as "-6 hours and -3 minutes"
     "-PT-6H+3M"  -- parses as "+6 hours and -3 minutes"
     */

    SimpleEntity entity = SimpleEntity.of("simple", "PT20.345S");
    entity.add("key1", "value1");
    entity.add("key2", "value2");
    return entity;
  }

  @GetMapping("/abstractEntity")
  public String abstractEntity() throws JsonProcessingException {
    String jsonObject = "{ \"type\": \"one\", \"abstract_name\": \"Abstract Entity\", \"model_one\": 2 }";
    AbstractEntity entity = objectMapper.readValue(jsonObject, AbstractEntity.class);
    return objectMapper.writeValueAsString(entity);
  }

  @GetMapping("/complexEntity")
  public String complexEntity() throws JsonProcessingException {
    String jsonObject = "{ \"full_name\": \"firstName lastName\" }";
    ComplexEntity entity = objectMapper.readValue(jsonObject, ComplexEntity.class);
    return objectMapper.writeValueAsString(entity);
  }

}
