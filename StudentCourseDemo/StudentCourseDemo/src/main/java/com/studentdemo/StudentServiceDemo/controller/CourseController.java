package com.studentdemo.StudentServiceDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentdemo.StudentServiceDemo.entity.Course;
import com.studentdemo.StudentServiceDemo.service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {

	@Autowired
	CourseService cs;
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course c)
	{
		return cs.addCourse(c);
		
	}
}
