package com.fairissac.spring_in_5_steps.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplicationScope {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationScope.class);

	public static void main(String[] args) {
		System.out.println("Happy Learning - Spring Framework");
		ApplicationContext scope = SpringApplication.run(SpringIn5StepsApplicationScope.class, args);
		PersonDAO personDao = scope.getBean(PersonDAO.class);
		var result = personDao.getJdbcConnection();
		//System.out.println(result); //by deafult -  singleton scoping
		//you can change it by writing SCOPE("ConfigurableBeanFactory.PROTOTYPE - for new bean whenever requested)

		PersonDAO personDao_1 = scope.getBean(PersonDAO.class);
		var result_1 = personDao.getJdbcConnection();
		//System.out.println(result_1); //will be same as result as personDao for singleton
		//will be different for prototype

		LOGGER.info("{}", personDao); //replaces {} with personDao
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao_1);
		LOGGER.info("{}", personDao_1.getJdbcConnection());
	}

}
