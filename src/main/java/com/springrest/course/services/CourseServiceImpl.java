package com.springrest.course.services;

import com.springrest.course.dao.CourseDao;
import com.springrest.course.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {
    }

    @Override
    public List<Course> getCourses() {

        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

        return courseDao.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Course entity = courseDao.getById(parseLong);
        courseDao.delete(entity);

    }
}
