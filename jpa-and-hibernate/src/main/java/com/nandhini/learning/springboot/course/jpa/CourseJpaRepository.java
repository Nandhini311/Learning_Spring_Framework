package com.nandhini.learning.springboot.course.jpa;

import com.nandhini.learning.springboot.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    //@Autowired can be used as well but it's better to use the below
    @PersistenceContext //
    private EntityManager entityManager;


    public void insert(Course course){
        entityManager.merge(course); //we don't have to write the query wohooo
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id );
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
