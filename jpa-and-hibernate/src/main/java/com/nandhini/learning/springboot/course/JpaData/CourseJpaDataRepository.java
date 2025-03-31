package com.nandhini.learning.springboot.course.JpaData;

import com.nandhini.learning.springboot.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseJpaDataRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
    List<Course> findByName(String Name); //custom methods
}
