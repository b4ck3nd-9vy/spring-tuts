package com.example.springrest.restmvc.config.legacy;

import com.example.springrest.restmvc.entity.HostInfoLegacy;
import java.beans.PropertyEditorSupport;

// legacy approach
public class HostInfoEditor extends PropertyEditorSupport {

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    String[] parts = text.split(":");
    setValue(new HostInfoLegacy(parts[0], Integer.parseInt(parts[1])));
  }

}
