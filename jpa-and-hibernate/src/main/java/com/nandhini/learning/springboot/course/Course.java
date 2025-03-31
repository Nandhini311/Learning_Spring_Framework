package com.nandhini.learning.springboot.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


//mapping java bean to the tablet
@Entity//if you want the bean to have different name from the table.
//An Entity in JPA (Java Persistence API) is a POJO (Plain Old Java Object) that represents a database table.
//Each instance of an entity class corresponds to a row in the table.
public class Course {

    @Id
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="author")
    private String author;

    public Course(){
        super();
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "author='" + author + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
