package com.example.springrest.restmvc.config;

import com.example.springrest.restmvc.entity.ComplexEntity;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.context.annotation.Profile;

@JsonComponent(type = ComplexEntity.class)
@Profile("test")
public class CustomJsonComponent {

  public static class Serializer extends JsonObjectSerializer<ComplexEntity> {

    @Override
    protected void serializeObject(ComplexEntity value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException {
      jgen.writeStringField("name", value.getFirstName().toLowerCase() + " " + value.getLastName().toUpperCase());
    }

  }

  public static class Deserializer extends JsonObjectDeserializer<ComplexEntity> {

    @Override
    protected ComplexEntity deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec,
        JsonNode tree) throws IOException {
      String name = nullSafeValue(tree.get("full_name"), String.class);
      String[] names = name.split(" ");
      return new ComplexEntity(names[0], names[1]);
    }

  }

}
