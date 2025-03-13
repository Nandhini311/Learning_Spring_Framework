package com.fairissac.spring_in_5_steps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args)
	{
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlogirthm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 7, 9}, 4);
		System.out.println(result);
		BinarySearchImpl binarySearch1 = new BinarySearchImpl(new QuickSortAlgorithm());
		int result1 = binarySearch1.binarySearch(new int[]{12, 5, 3, 6}, 3);
		System.out.println(result1);

		System.out.println("Happy Learning - Spring Framework");
		//this way you can you use any sorting alogrithm without changing anything at the backend code level.
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
