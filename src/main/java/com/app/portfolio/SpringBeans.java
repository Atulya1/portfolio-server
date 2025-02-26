package com.app.portfolio;

import com.app.portfolio.repository.TechnologyRepository;
import com.app.portfolio.service.ExperienceService;
import com.app.portfolio.service.TechnologyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeans {

  @Bean
  public TechnologyRepository technologyRepository() {
    return new TechnologyRepository();
  }

  @Bean
  public TechnologyService technologyService() {
    return new TechnologyService(technologyRepository());
  }

  @Bean
  public ExperienceService experienceService() {
    return new ExperienceService();
  }
}
