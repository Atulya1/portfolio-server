package com.app.portfolio;

import com.app.portfolio.service.ExperienceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeans.class);
		ExperienceService agent = context.getBean(ExperienceService.class);
		agent.getAllExperience();
		//SpringApplication.run(PortfolioApplication.class, args);
	}

}
