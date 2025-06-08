package com.example.springrest.restmvc.config;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

@Getter
@Setter
@ConfigurationProperties(prefix = "my.conversion")
public class ConversionConfig {

  /*
  Duration Unit:
  ns for nanoseconds
  us for microseconds
  ms for milliseconds
  s for seconds
  m for minutes
  h for hours
  d for days
   */

  @DurationUnit(ChronoUnit.SECONDS)
  private Duration sessionTimeout; // seconds <- 30, PT30S, 30s

  private Duration readTimeout; // millis <- 500, PT0.5S, 500ms

  /*
  Period Unit:
  y for years
  m for months
  w for weeks
  d for days
   */

  private Period backupTime;

  @PeriodUnit(ChronoUnit.WEEKS)
  private Period updateTime; // weeks

  /*
  Data Size Unit:
  B for bytes
  KB for kilobytes
  MB for megabytes
  GB for gigabytes
  TB for terabytes
   */

  @DataSizeUnit(DataUnit.MEGABYTES)
  private DataSize bufferSize; // megabytes

  private DataSize sizeThreshold; // bytes

}
