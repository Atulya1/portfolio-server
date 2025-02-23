package com.app.portfolio.model;

import java.util.List;
import java.util.UUID;

public class Experience {

  private String experienceId = UUID.randomUUID().toString();
  private String companyName;
  private String designation;
  private List<Project> projects;
  private String imageLink;

  public Experience() {

  }
  public Experience(String companyName, String designation, List<Project> projects, String imageLink) {
    this.companyName = companyName;
    this.designation = designation;
    this.projects = projects;
    this.imageLink = imageLink;
  }

  public String getExperienceId() {
    return experienceId;
  }

  public void setExperienceId(String experienceId) {
    this.experienceId = experienceId;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }

  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }
}
