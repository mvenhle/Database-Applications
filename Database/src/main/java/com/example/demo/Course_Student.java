package com.example.demo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course_Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int CourseID;
	private int StudentID;
	
	@OneToMany
	private List<Student> student;
	
	public Course_Student() {
	}

	


	public Course_Student(int courseID, int studentID, List<Student> student) {
		super();
		CourseID = courseID;
		StudentID = studentID;
		this.student = student;
	}




	@Override
	public String toString() {
		return "Course_Student [CourseID=" + CourseID + ", StudentID=" + StudentID + ", student=" + student + "]";
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
