package com.example.demo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String DepartmentName;
	private int LecturerID;
	private int Duration;
	private String Name;

	@OneToMany
	private List<Course_Student> coursestudent;
	
	public Course(){}
	
	public Course(int iD, String departmentName, int lecturerID, int duration, String name,
			List<Course_Student> coursestudent) {
		super();
		ID = iD;
		DepartmentName = departmentName;
		LecturerID = lecturerID;
		Duration = duration;
		Name = name;
		this.coursestudent = coursestudent;

	}

	@Override
	public String toString() {
		return "Course [ID=" + ID + ", DepartmentName=" + DepartmentName + ", LecturerID=" + LecturerID + ", Duration="
				+ Duration + ", Name=" + Name + ", coursestudent=" + coursestudent + "]";
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getDepartmentName() {
		return DepartmentName;
	}



	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}



	public int getLecturerID() {
		return LecturerID;
	}



	public void setLecturerID(int lecturerID) {
		LecturerID = lecturerID;
	}



	public int getDuration() {
		return Duration;
	}



	public void setDuration(int duration) {
		Duration = duration;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public List<Course_Student> getCoursestudent() {
		return coursestudent;
	}



	public void setCoursestudent(List<Course_Student> coursestudent) {
		this.coursestudent = coursestudent;
	}
	
		
}