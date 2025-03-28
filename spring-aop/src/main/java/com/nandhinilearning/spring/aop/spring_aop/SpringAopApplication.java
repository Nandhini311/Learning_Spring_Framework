package com.nandhinilearning.spring.aop.spring_aop;

import com.nandhinilearning.spring.aop.spring_aop.business.Business;
import com.nandhinilearning.spring.aop.spring_aop.business.Business2;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business business1;

	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	//whatever we put here gets executed immediately when we run the application.
	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.CalculateSomething());
		logger.info(business2.CalculateSomething());

	}
}
