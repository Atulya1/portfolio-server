package com.app.portfolio;

import com.app.portfolio.service.ExperienceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeans {

  @Bean
  public ExperienceService experienceService() {
    return new ExperienceService();
  }
}
