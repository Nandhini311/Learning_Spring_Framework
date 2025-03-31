//package com.nandhini.learning.springboot.course.jdbc;
//
//import ch.qos.logback.core.net.SyslogOutputStream;
//import com.nandhini.learning.springboot.course.Course;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//
//    @Autowired
//    private CourseJdbcRepository repository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        //when you want something to be performed when the spring boot application is starting.
//        System.out.println("Running CommandLineRunner...");
//        repository.insert(new Course(1, "Web Development", "Angela"));
//        repository.insert(new Course(2, "AWS", "Ranga"));
//        repository.insert(new Course(3, "Spring", "John"));
//        repository.deleteById((long)2);
//        System.out.println(repository.findById(1));
//    }
//}
