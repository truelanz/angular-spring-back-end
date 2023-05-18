package com.truelanz.angularspringbackend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truelanz.angularspringbackend.entities.Course;
import com.truelanz.angularspringbackend.repositories.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    //Evitar usar @Autowired nesse tipo de instancia e utilizar "final".
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

}