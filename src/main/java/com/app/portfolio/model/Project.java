package com.app.portfolio.model;

import java.util.List;
import java.util.UUID;

public class Project {

  private String projectId = UUID.randomUUID().toString();
  private String projectTitle;
  private List<Technology> technologies;
  private String projectOverview;
  private List<String> keyFeatures;
  private String imageLink;

  public Project(String projectTitle, List<Technology> technologies, String projectOverview,
                 List<String> keyFeatures, String imageLink) {
    this.projectTitle = projectTitle;
    this.technologies = technologies;
    this.projectOverview = projectOverview;
    this.keyFeatures = keyFeatures;
    this.imageLink = imageLink;
  }
}
