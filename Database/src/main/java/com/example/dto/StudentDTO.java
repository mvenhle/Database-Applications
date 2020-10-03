package com.example.dto;

public class StudentDTO {

	private String FirstName;
	private String LastName;
	private int Phone;
	
	@Override
	public String toString() {
		return "StudentDTO [FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone + "]";
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
