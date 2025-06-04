package com.example.springrest.restmvc;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@PropertySource(RandomValuePropertySource.RANDOM_PROPERTY_SOURCE_NAME)
@ConfigurationProperties(prefix = "random")
public class RandomConfig {

  private String secretToken;

  @Value("${random.long[1000,5000000000]}")
  private Long longValue;

  @Value("${random.int[1000,500000]}")
  private Integer intValue;

  @Value("${random.byte[]}")
  private String byteArray;

}
