package com.studentdemo.StudentServiceDemo.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String address;
	
	@ManyToMany
	@JoinTable(
		        name = "student_course", // Join table name
		        joinColumns = @JoinColumn(name = "student_id"), // Foreign key in the join table for Student
		        inverseJoinColumns = @JoinColumn(name = "course_id") // Foreign key in the join table for Course
		    )
	List<Course> cr;

	public Student(int id, String name, String address, List<Course> cr) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.cr = cr;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getCr() {
		return cr;
	}

	public void setCr(List<Course> cr){
		this.cr = cr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", cr=" + cr + "]";
	}
}
