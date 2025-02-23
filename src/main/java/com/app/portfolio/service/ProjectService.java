package com.app.portfolio.service;

import com.app.portfolio.model.Project;

import java.util.List;

public class ProjectService {
  public void addProject(Project project) {
    System.out.println("project added");
  }
  public void updateProject(String projectId) {
    System.out.println("updated project with project id : "+projectId);
  }

  public Project getProject(String projectId) {
    System.out.println("returning project with id : "+projectId);
    return null;
  }

  public void deleteProject(String projectId) {
    System.out.println("deleted product with product id : "+ projectId);
  }

  public List<Project> getAllProjects() {
    System.out.println("returning all projects");
    return null;
  }
}
