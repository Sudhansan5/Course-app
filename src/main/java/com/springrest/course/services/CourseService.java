package com.springrest.course.services;

import com.springrest.course.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);
}
