package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.repository.CourseRepository;
import com.example.repository.Course_StudentRepository;
import com.example.repository.LecturerRepository;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo (Course_StudentRepository CSrepository, CourseRepository courseRepository, StudentRepository studentRepository, 
			LecturerRepository lecturerRepository) {
		return (args) -> {
			
			Student student = new Student("Mohammad Ehsan", "Shah", 886726263);
			student = studentRepository.save(student);
			
			Course_Student cs = new Course_Student(0011, 15767,new ArrayList<Student>(Arrays.asList(student)));
			cs = CSrepository.save(cs);
			
			Course course = new Course(007, "Computing", 0011, 25, "Database",new ArrayList<Course_Student>(Arrays.asList(cs)));
			course = courseRepository.save(course);
			
			Lecturer lecturer = new Lecturer(0011, "Database", "Adrian", 659878889,new ArrayList<Course>(Arrays.asList(course)));
			lecturerRepository.save(lecturer);
			
			
		};
	}
}
