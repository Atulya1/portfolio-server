package com.app.portfolio.model;

import java.util.UUID;

public class Technology {
    private String id = UUID.randomUUID().toString();
    private String name;
    private TechnologyType type;

    public Technology(String name, TechnologyType type) {
      this.name = name;
      this.type = type;
    }
  }