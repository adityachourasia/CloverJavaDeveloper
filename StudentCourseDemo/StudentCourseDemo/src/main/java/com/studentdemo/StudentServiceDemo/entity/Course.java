package com.studentdemo.StudentServiceDemo.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;

	@ManyToMany(mappedBy = "cr")
	List<Student> std;

	public Course(int id, String name, List<Student> std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
	}

	public Course() {
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

	public List<Student> getStd() {
		return std;
	}

	public void setStd(List<Student> std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", std=" + std + "]";
	}
		
}
