/*package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.example.demo.Course;
import com.example.demo.Course_Student;
import com.example.demo.Lecturer;
import com.example.demo.Student;
import com.example.dto.CourseDTO;
import com.example.dto.Course_StudentDTO;
import com.example.dto.LecturerDTO;
import com.example.dto.StudentDTO;
import com.example.mapper.CourseMapper;
import com.example.mapper.Course_StudentMapper;
import com.example.mapper.LecturerMapper;
import com.example.mapper.StudentMapper;

public class TestingMappers {

	private Course_StudentMapper csMapper = Mappers.getMapper(Course_StudentMapper.class);
	private CourseMapper courseMapper = Mappers.getMapper(CourseMapper.class);
	private LecturerMapper lecturerMapper = Mappers.getMapper(LecturerMapper.class);
	private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

@Test
public void StudentTest() {
	Student student = new Student();
	student.setFirstName("Bradley");
	StudentDTO studentDTO = studentMapper.studentToDTO(student);
	
	assertEquals(student.getFirstName(),studentDTO.getFirstName());
	}

@Test
public void LecturerTest() {
	Lecturer lecturer = new Lecturer();
	lecturer.setFirstName("Adrian");
	LecturerDTO lecturerDTO = lecturerMapper.lecturerToDTO(lecturer);
	
	assertEquals(lecturer.getFirstName(),lecturerDTO.getFirstName());
	}

@Test
public void CourseTest() {
	Course course = new Course();
	course.setName("Database");
	CourseDTO courseDTO = courseMapper.courseToDTO(course);
	assertEquals(course.getName(),courseDTO.getName());
	}

@Test
public void Course_StudentTest() {
	Course_Student cs = new Course_Student();
	cs.setCourseID(1016);
	Course_StudentDTO course_studentDTO = csMapper.course_studentToDTO(cs);
	assertEquals(cs.getCourseID(),course_studentDTO.getCourseID());
	}

}*/