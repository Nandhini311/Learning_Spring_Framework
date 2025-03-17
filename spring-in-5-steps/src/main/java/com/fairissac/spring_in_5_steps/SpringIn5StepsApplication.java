package com.fairissac.spring_in_5_steps;


import com.fairissac.spring_in_5_steps.scope.PersonDAO;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	public static void main(String[] args)
	{
		//BinarySearchImpl binarySearch = new BinarySearchImpl();
		//int result = binarySearch.binarySearch(new int[] {12, 4, 7, 9}, 4);
		//System.out.println(result);
		//BinarySearchImpl binarySearch1 = new BinarySearchImpl(new QuickSortAlgorithm());

		//Spring Application context - where all the beans are managed.
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		int result1 = binarySearch1.binarySearch(new int[] {12, 4, 7, 9}, 4);
		System.out.println(result1);

		System.out.println("Happy Learning - Spring Framework");
		//this way you can you use any sorting alogrithm without changing anything at the backend code level.
		//SpringApplication.run(SpringIn5StepsApplication.class, args);

		//this way you aren't creating new instance of binarySearch. Spring is doing it for you
		//if you want something to be performed only after all the depenedencies are populated, we can use the belo


	}

}
