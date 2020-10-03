package com.example.dto;

import java.util.List;
import com.example.demo.Student;

public class Course_StudentDTO {
	
	private int CourseID;
	private int StudentID;
	private List<Student> student;
	
	@Override
	public String toString() {
		return "Course_StudentDTO [CourseID=" + CourseID + ", StudentID=" + StudentID + ", student=" + student + "]";
	}
	
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}

	
}
