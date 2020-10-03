package com.example.mapper;

import org.mapstruct.Mapper;

import com.example.demo.Student;
import com.example.dto.StudentDTO;

@Mapper(componentModel = "spring")
public interface StudentMapper {
	
	StudentDTO studentToDTO(Student student);

}
