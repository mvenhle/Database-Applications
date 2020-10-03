package com.example.mapper;

import org.mapstruct.Mapper;

import com.example.demo.Lecturer;
import com.example.dto.LecturerDTO;

@Mapper(componentModel = "spring")
public interface LecturerMapper {
	
	LecturerDTO lecturerToDTO(Lecturer lecturer);
	

}
