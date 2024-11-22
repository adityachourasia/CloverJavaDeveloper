package com.clover.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class CourseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long course_Id;
	
	@Column
	private String courseName;
	
	@Column
	private String discription;

	public Long getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(Long course_Id) {
		this.course_Id = course_Id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "CourseEntity [course_Id=" + course_Id + ", courseName=" + courseName + ", discription=" + discription
				+ ", getCourse_Id()=" + getCourse_Id() + ", getCourseName()=" + getCourseName() + ", getDiscription()="
				+ getDiscription() + "]";
	}
	

}
