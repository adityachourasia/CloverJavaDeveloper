package com.clover.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Studentid;
	private String StudentName;
	public Long getStudentid() {
		return Studentid;
	}
	public void setStudentid(Long studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
	        name = "student_courses",
	        joinColumns = @JoinColumn(name = "student_id"),
	        inverseJoinColumns = @JoinColumn(name = "course_id")
	    )
	
	private List<Course> courses;
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	

}
