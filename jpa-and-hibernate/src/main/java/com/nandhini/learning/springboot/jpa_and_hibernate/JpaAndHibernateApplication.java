package com.nandhini.learning.springboot.jpa_and_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.nandhini.learning.springboot")
@EntityScan(basePackages = "com.nandhini.learning.springboot.course")
@EnableJpaRepositories(basePackages = "com.nandhini.learning.springboot.course.JpaData")
public class JpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAndHibernateApplication.class, args);

	}

}
