package com.clover.studentinfo.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.clover.studentinfo.dto.Course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student_record")
public class StudentEntity {

	@Id
	@Column(name = "Student_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studId;
	@Column(name = "Student_Name")
	private String studName;

	@OneToMany(fetch = FetchType.EAGER)
	private List<CourseEntity> studCourse;

	// @Column(name="Address") private Address studAddress;

	@Column(name = "created_at")
	private LocalDateTime created_at;
	@Column(name = "updated_at")
	private LocalDateTime updated_at;

}
