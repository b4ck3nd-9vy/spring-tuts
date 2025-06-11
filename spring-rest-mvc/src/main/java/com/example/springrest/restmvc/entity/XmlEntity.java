package com.example.springrest.restmvc.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JacksonXmlRootElement(localName = "Entity")
public class XmlEntity {

  @JacksonXmlProperty(localName = "FirstName")
  private String firstName;

  @JacksonXmlProperty(localName = "LastName")
  private String lastName;

}
