package com.app.portfolio.service;

import com.app.portfolio.model.Technology;
import com.app.portfolio.model.TechnologyType;
import com.app.portfolio.repository.TechnologyRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TechnologyService {

  private final TechnologyRepository technologyRepository;
  public TechnologyService(TechnologyRepository technologyRepository) {
    this.technologyRepository = technologyRepository;
  }
  public void addTechnology(String technologyName, String technologyType) {
    TechnologyType techType = getTechnologyType(technologyType);
    if (techType != null) {
      Technology technology = new Technology(technologyName, techType);
      technologyRepository.getTechnologyList().add(technology);
    }
  }

  public String getAllTechnologiesAsJSON() throws JsonProcessingException {
    List<Technology> technologies = technologyRepository.getTechnologyList();

    // Convert List<Technology> into a Map<String, List<String>>
    Map<String, List<String>> technologyMap = Arrays.stream(TechnologyType.values())
            .collect(Collectors.toMap(
                    type -> formatEnum(type),  // Formatting enum names
                    type -> new ArrayList<>()  // Initializing empty lists
            ));

    // Populate the map
    for (Technology tech : technologies) {
      technologyMap.get(formatEnum(tech.getTechnologyType())).add(tech.getTechnologyName());
    }

    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(technologyMap);

  }

  public List<Technology> getAllTechnology() {
    return technologyRepository.getTechnologyList();
  }
  // Format Enum Names to match expected JSON format
  private static String formatEnum(TechnologyType type) {
    return type.name()
            .replace("DATABASEANDFRAMEWORK", "DATABASE AND FRAMEWORK")
            .replace("TOOLSANDTECHNOLOGIES", "TOOLS AND TECHNOLOGIES")
            .replace("DEVOPSANDINFRASTRUCTURE", "DEVOPS AND INFRASTRUCTURE");
  }
  private TechnologyType getTechnologyType(String technologyType) {
    if (technologyType == null) {
      return null;
    }

    String techType = technologyType.toUpperCase();

    return switch (techType) {
      case "LANGUAGES" -> TechnologyType.LANGUAGES;
      case "DATABASEANDFRAMEWORK" -> TechnologyType.DATABASEANDFRAMEWORK;
      case "TOOLSANDTECHNOLOGIES" -> TechnologyType.TOOLSANDTECHNOLOGIES;
      case "DEVOPSANDINFRASTRUCTURE" -> TechnologyType.DEVOPSANDINFRASTRUCTURE;
      default -> null;
    };
  }

}
