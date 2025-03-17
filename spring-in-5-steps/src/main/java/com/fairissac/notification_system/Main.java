package com.fairissac.notification_system;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.fairissac.notification_system")
public class Main {


    public static void main(String[] args) {
        //Starts the Spring Boot application.
        //creates and initializes the spring application context
        //Automatically scans and registers Spring components (beans) in the package.
        ApplicationContext context = SpringApplication.run(Main.class, args);
        User user = context.getBean(User.class);
        //The getBean(User.class) method retrieves an instance of the User class from the Spring context.
        user.notification();
    }
}
