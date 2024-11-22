package com.student.dto;

public class StudentDto {

	private String stdName;
	private String stdCourse;
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdCourse() {
		return stdCourse;
	}
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
	@Override
	public String toString() {
		return "StudentDto [stdName=" + stdName + ", stdCourse=" + stdCourse + "]";
	}
	
}
