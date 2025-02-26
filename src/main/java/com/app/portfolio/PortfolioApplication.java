package com.app.portfolio;

import com.app.portfolio.repository.TechnologyRepository;
import com.app.portfolio.service.ExperienceService;
import com.app.portfolio.service.TechnologyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) throws JsonProcessingException {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeans.class);
		ExperienceService expAgent = context.getBean(ExperienceService.class);
		TechnologyRepository tecAgent = context.getBean(TechnologyRepository.class);
		TechnologyService tecServiceAgent = context.getBean(TechnologyService.class);
		expAgent.getAllExperience();
		System.out.println(tecServiceAgent.getAllTechnologiesAsJSON());

		//SpringApplication.run(PortfolioApplication.class, args);
	}

}
