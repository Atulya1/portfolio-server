package com.app.portfolio.service;

import com.app.portfolio.model.Experience;

import java.util.List;

public class ExperienceService {
  public void addExperience(Experience experience) {
    System.out.println("Experience added");
  }

  public List<Experience> getAllExperience() {
    System.out.println("All Experiences returned");
    return null;
  }

  public void updateExperience(Experience experience) {
    System.out.println("Experience updated");
  }

  public void deleteExperience(Experience experience) {
    System.out.println("Experience deleted");
  }

  public Experience getExperience(String companyName) {
    System.out.println("Experience returned for Company : "+ companyName);
    return null;
  }
}
