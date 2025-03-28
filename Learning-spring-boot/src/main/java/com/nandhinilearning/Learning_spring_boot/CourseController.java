package com.nandhinilearning.Learning_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

/** creating a simple API with Spring boot
 so when someone clicks on the url, we want them to have the below details
 //course: id, name, author **/

@RestController //since we are going to create a rest api
//converts the data to JSON. 
public class CourseController {

    @RequestMapping("/courses")
    //Maps HTTP requests to methods.
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1, "Learn SpringBoot", "in28minutes"),
                new Course(2, "Learn Java", "John"),
                new Course(3, "Learn Web Development", "Angela"),
                new Course(3, "Learn Web Development", "Angela")
        );
    }
}
