package com.clover.studentinfo.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class StudentDto {

	private Integer studId;
	private String studName;
	private List<Course> studCourse;
	private LocalDateTime created_at;
	private LocalDateTime updated_at;

}
