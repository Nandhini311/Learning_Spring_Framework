package com.fairissac.cdi;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CDIApplication {
	public static void main(String[] args)
	{
		System.out.println("CDI Framework");
		ApplicationContext applicationContext = SpringApplication.run(CDIApplication.class, args);
		var result = applicationContext.getBean(CDIBusiness.class);
		System.out.println(result);



	}

}
