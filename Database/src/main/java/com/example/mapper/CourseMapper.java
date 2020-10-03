package com.example.mapper;

import org.mapstruct.Mapper;

import com.example.demo.Course;
import com.example.dto.CourseDTO;

@Mapper(componentModel = "spring")
public interface CourseMapper {
	
	CourseDTO courseToDTO(Course course);

}
