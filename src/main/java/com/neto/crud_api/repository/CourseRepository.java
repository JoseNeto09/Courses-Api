package com.neto.crud_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.neto.crud_api.model.Course;



@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    

}