package com.nandhinilearning.Learning_spring_boot;

public class Course {
    private long id;
    private String courseName;
    private String author;

    public Course(long id, String courseName, String author) {
        this.author = author;
        this.courseName = courseName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "author='" + author + '\'' +
                ", id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getCourseName() {
        return courseName;
    }

    public long getId() {
        return id;
    }
}
