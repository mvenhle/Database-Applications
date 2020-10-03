package com.example.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

	Optional<Student> findByFirstName(String firstname);

}