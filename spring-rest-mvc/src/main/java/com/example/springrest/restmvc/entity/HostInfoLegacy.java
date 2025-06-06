package com.example.springrest.restmvc.entity;

import lombok.Getter;

@Getter
public class HostInfoLegacy {

  private final String host;
  private final int port;

  public HostInfoLegacy(String host, int port) {
    this.host = host;
    this.port = port;
  }

  @Override
  public String toString() {
    return host + ":" + port;
  }

}
