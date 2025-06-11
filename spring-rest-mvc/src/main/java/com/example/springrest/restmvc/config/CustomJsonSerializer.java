package com.example.springrest.restmvc.config;

import com.example.springrest.restmvc.entity.ComplexEntity;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.annotation.Profile;

@JsonComponent(type = ComplexEntity.class)
@Profile("dev")
public class CustomJsonSerializer extends JsonSerializer<ComplexEntity> {

  @Override
  public void serialize(ComplexEntity value, JsonGenerator jgen, SerializerProvider provider)
      throws IOException {
    jgen.writeStartObject();
    jgen.writeStringField("name", value.getFirstName().toLowerCase() + " " + value.getLastName().toUpperCase());
    jgen.writeEndObject();
  }

}
