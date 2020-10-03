package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student;
import com.example.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

		@Autowired
		private StudentRepository studentRepository;

		@GetMapping()
		public Iterable<Student> findAll() {
			return studentRepository.findAll();
		}
		
		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public Student create(@RequestBody Student student) {
			return studentRepository.save(student);
		}

		@DeleteMapping("/{id}")
		public void delete(@PathVariable Long id) {
			studentRepository.findById(id).orElseThrow(IllegalArgumentException::new);
			studentRepository.deleteById(id);
		}

		@PutMapping("/{id}")
		public Student updateStudent(@RequestBody Student student, @PathVariable String firstname) {
			if (student.getFirstName() != firstname) {
				throw new IllegalArgumentException();
			}
			studentRepository.findByFirstName(firstname).orElseThrow(IllegalArgumentException::new);
			return studentRepository.save(student);


		}
	}
