package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String FirstName;
	private String LastName;
	private int Phone;
	
	public Student() {}
	
	public Student(String firstName, String lastName, int phone) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Phone = phone;
	}







	@Override
	public String toString() {
		return "Student [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone + "]";
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	
}