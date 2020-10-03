package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lecturer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String DepartmentName;
	private String FirstName;
	private int Phone;
	
	@OneToMany
	private List<Course> course;
	
	
	public Lecturer(){}
	
		public Lecturer(int iD, String departmentName, String firstName, int phone, List<Course> course) {
		super();
		ID = iD;
		DepartmentName = departmentName;
		FirstName = firstName;
		Phone = phone;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Lecturer [ID=" + ID + ", DepartmentName=" + DepartmentName + ", FirstName=" + FirstName + ", Phone="
				+ Phone + ", course=" + course + "]";
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

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	

}