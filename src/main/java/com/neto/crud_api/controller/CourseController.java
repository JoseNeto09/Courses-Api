package com.neto.crud_api.controller;

import com.neto.crud_api.model.*;
import com.neto.crud_api.repository.CourseRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {
    
    private final CourseRepository courseRepository; 

    @GetMapping
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();

    }

}
