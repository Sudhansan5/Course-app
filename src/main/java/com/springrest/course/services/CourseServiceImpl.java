package com.springrest.course.services;

import com.springrest.course.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(123, "Java", "Course on Java"));
        list.add(new Course(126, "Python", "Course on Python"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c=null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }
}
