package com.app.portfolio.repository;

import com.app.portfolio.model.Technology;
import com.app.portfolio.model.TechnologyType;

import java.util.ArrayList;
import java.util.List;

public class TechnologyRepository {
  private List<Technology> technologyList ;

  public TechnologyRepository() {
    technologyList = new ArrayList<>();

    // LANGUAGES
    technologyList.add(new Technology("Java", TechnologyType.LANGUAGES));
    technologyList.add(new Technology("Python", TechnologyType.LANGUAGES));
    technologyList.add(new Technology("JavaScript", TechnologyType.LANGUAGES));
    technologyList.add(new Technology("TypeScript", TechnologyType.LANGUAGES));
    technologyList.add(new Technology("C", TechnologyType.LANGUAGES));
    technologyList.add(new Technology("C++", TechnologyType.LANGUAGES));
    technologyList.add(new Technology("Kotlin", TechnologyType.LANGUAGES));
    technologyList.add(new Technology("PHP", TechnologyType.LANGUAGES));

    // DATABASE AND FRAMEWORKS
    technologyList.add(new Technology("Spring Boot", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("ReactJS", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("NextJS", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("P5.js", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("Redux", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("Node.js", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("Agile SDLC", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("SQL", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("MongoDB", TechnologyType.DATABASEANDFRAMEWORK));
    technologyList.add(new Technology("Vector Database", TechnologyType.DATABASEANDFRAMEWORK));

    // TOOLS AND TECHNOLOGIES
    technologyList.add(new Technology("HTML", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("XML", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("CSS", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Bootstrap", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("HTTP", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("jQuery", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Jira", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Object-Oriented Design", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Scrum", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Confluence", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Git", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Microservices", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("REST APIs", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Junit", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("OpenAPI", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("SDLC", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Maven", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Elasticsearch", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Kibana", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("SaaS", TechnologyType.TOOLSANDTECHNOLOGIES));
    technologyList.add(new Technology("Databricks", TechnologyType.TOOLSANDTECHNOLOGIES));

    // DEVOPS AND INFRASTRUCTURE
    technologyList.add(new Technology("AWS", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("Azure", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("Terraform", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("Linux", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("Apache Tomcat", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("Apache Kafka", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("CI/CD", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("Kubernetes", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("Docker", TechnologyType.DEVOPSANDINFRASTRUCTURE));
    technologyList.add(new Technology("Jenkins", TechnologyType.DEVOPSANDINFRASTRUCTURE));
  }
  public List<Technology> getTechnologyList() {
    return technologyList;
  }

}
