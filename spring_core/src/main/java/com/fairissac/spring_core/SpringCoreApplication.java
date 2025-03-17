package com.fairissac.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //To let system know where you can find and define the beans but doesn't start the application
@ComponentScan("com.fairissac.spring_core")

public class SpringCoreApplication {

	public static void main(String[] args) {

		//this is the application context, this is what managest the lifecycle of the beans
		//loads, manages and provides beans to the applicaiton
		//will automatically close application context if there are any errors
			try(AnnotationConfigApplicationContext aContext =
					new AnnotationConfigApplicationContext(SpringCoreApplication.class)) {
				BinarySearch binarySearch = aContext.getBean(BinarySearch.class);
				int result = binarySearch.binarySearch(new int[]{1, 2, 3, 4}, 5);
				System.out.println(result);
			}
		//SpringApplication.run(SpringCoreApplication.class, args);
	}

}
