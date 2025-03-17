package com.fairissac.ComponentScan;

import com.fairissac.spring_in_5_steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


public class SpringIn5StepsApplicationComponentScan {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationComponentScan.class);

	public static void main(String[] args) {
		System.out.println("Happy Learning - Spring Framework");
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplicationComponentScan.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class, args);
		var result = componentDAO.getJdbcConnection();

		LOGGER.info("{}", componentDAO);

	}

}
