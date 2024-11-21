package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Course;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/studentDetail")
public class StudentDetailController {

	@Autowired
	private StudentService studentService;
	
	
	
	 @GetMapping("/{studentId}/course")
	    public List<Course> getCoursesForStudent(@PathVariable Integer studentId) {
	        return studentService.getCourseDetail(studentId);
	    }
	 
	 
	 @PostMapping("/{studentId}/course/{courseId}")
	    public String registerCourse(@PathVariable Integer studentId, @PathVariable Integer courseId) {
	        studentService.addCourse(studentId, courseId);
	        return "Courses are registered successfull";
	    }
}
