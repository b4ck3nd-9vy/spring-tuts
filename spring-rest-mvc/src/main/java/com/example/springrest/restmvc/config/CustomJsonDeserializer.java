package com.example.springrest.restmvc.config;

import com.example.springrest.restmvc.entity.ComplexEntity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.annotation.Profile;

@JsonComponent(type = ComplexEntity.class)
@Profile("dev")
public class CustomJsonDeserializer extends JsonDeserializer<ComplexEntity> {

  @Override
  public ComplexEntity deserialize(JsonParser p, DeserializationContext ctxt)
      throws IOException {
    JsonNode tree = p.getCodec().readTree(p);
    String name = tree.get("full_name").asText();
    String[] names = name.split(" ");
    return new ComplexEntity(names[0], names[1]);
  }

}
