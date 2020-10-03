package com.example.dto;

public class CourseDTO {
	
	private String DepartmentName;
	private int Duration;
	private String Name;
	
	@Override
	public String toString() {
		return "CourseDTO [DepartmentName=" + DepartmentName + ", Duration=" + Duration + ", Name=" + Name + "]";
	}
	
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
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

}
