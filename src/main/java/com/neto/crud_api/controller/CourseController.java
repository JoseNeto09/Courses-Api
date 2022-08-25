package com.neto.crud_api.controller;

import com.neto.crud_api.model.*;
import com.neto.crud_api.repository.CourseRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(courseRepository.save(course));
    } 

}
