package com.example.dto;

public class LecturerDTO {
	
	private String DepartmentName;
	private String FirstName;
	private int Phone;
	
	@Override
	public String toString() {
		return "LecturerDTO [DepartmentName=" + DepartmentName + ", FirstName=" + FirstName + ", Phone=" + Phone + "]";
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

}
