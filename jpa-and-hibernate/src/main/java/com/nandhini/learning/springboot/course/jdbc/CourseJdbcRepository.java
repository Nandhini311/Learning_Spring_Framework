package com.nandhini.learning.springboot.course.jdbc;

import com.nandhini.learning.springboot.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
//this is a repository class which helps in storing data using JDBC - java databse connectivity
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate; //Jdbc template is a tool to talk to the database.
    private static String INSERT_QUERY = """
            insert into COURSE (id, name, author)
            values(?, ?,?)
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    private static String DELETE_QUERY = """
            delete from COURSE where id = ?
            """;

    public void deleteById(Long id){
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    private static String SELECT_QUERY = """
            select * from course where id = ? 
            """;

    public Course findById(long id){
        Course result = springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
        return result;
    }
}
