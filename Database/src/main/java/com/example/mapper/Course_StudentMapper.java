package com.example.mapper;

import org.mapstruct.Mapper;

import com.example.demo.Course_Student;
import com.example.dto.Course_StudentDTO;

@Mapper(componentModel = "spring")
public interface Course_StudentMapper {
	
	Course_StudentDTO course_studentToDTO(Course_Student cs);

}
