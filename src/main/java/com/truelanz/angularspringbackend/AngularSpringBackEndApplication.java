package com.truelanz.angularspringbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.truelanz.angularspringbackend.entities.Course;
import com.truelanz.angularspringbackend.repositories.CourseRepository;

@SpringBootApplication
public class AngularSpringBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringBackEndApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course course = new Course();
			course.setName("Angular com Spring");
			course.setCategory("Front-end");

			Course course2 = new Course(null, "Java", "Back-end");

			courseRepository.save((course));
			courseRepository.save((course2));
		};
	}
}
