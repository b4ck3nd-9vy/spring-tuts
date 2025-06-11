package com.example.springrest.restmvc.controller;

import com.example.springrest.restmvc.entity.XmlEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xml")
@Slf4j
public class XmlController {

  @GetMapping(value = "/entity", produces = MediaType.APPLICATION_XML_VALUE)
  public XmlEntity entity() throws JsonProcessingException {
    return new XmlEntity("value1", "value2");
  }

}
