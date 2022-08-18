package com.neto.crud_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.neto.crud_api.model.Course;
import com.neto.crud_api.repository.CourseRepository;

@SpringBootApplication
public class CrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApiApplication.class, args);
	}
/* 
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args ->{
			courseRepository.deleteAll();

			Course c = new Course();

			c.setName("Angular com spring");
			c.setCategoria("front-end");

            courseRepository.save(c);
		};
	}
*/
}
