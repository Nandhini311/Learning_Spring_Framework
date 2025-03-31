package com.nandhini.learning.springboot.course.JpaData;

import com.nandhini.learning.springboot.course.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner {

  @Autowired
  private CourseJpaDataRepository repository;

    @Override
   public void run(String... args) throws Exception {
       //when you want something to be performed when the spring boot application is starting.
        System.out.println("Running CommandLineRunner...");
        repository.save(new Course(1l, "Web Development", "Angela"));
        repository.save(new Course(2l, "AWS", "Ranga"));
        repository.save(new Course(3l, "Spring", "John"));
        repository.deleteById(2l);
        System.out.println(repository.findById(3l));
        repository.count();

        //you can add custom methods as well. //you just need to add the method in your Jpa data repository interface, you don't have to define the method.
        System.out.println(repository.findByAuthor("Angela"));
        System.out.println(repository.findByName("AWS"));

   }
}
