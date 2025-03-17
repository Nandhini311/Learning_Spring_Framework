package com.fairissac.spring_in_5_steps.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@PropertySource("app.properties")
@Component
public class ExternalServiceApplication {
	public static void main(String[] args)
	{
		ApplicationContext externalApplication = SpringApplication.run(ExternalServiceApplication.class, args);
		SomeExternalService externalService = externalApplication.getBean(SomeExternalService.class);
			System.out.println(externalService);
			System.out.println(externalService.returnServiceURL());
		}


}

