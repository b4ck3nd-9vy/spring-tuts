package com.example.springrest.restmvc.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AbstractEntity.ModelOne.class, name = "one"),
    @JsonSubTypes.Type(value = AbstractEntity.ModelTwo.class, name = "two")
})
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractEntity {

  private String abstractName;

  @Getter
  @Setter
  @NoArgsConstructor
  //@JsonTypeName("one")
  public static class ModelOne extends AbstractEntity {

    private int modelOne;

  }

  @Getter
  @Setter
  @NoArgsConstructor
  //@JsonTypeName("two")
  public static class ModelTwo extends AbstractEntity {

    private int modelTwo;

  }

}
