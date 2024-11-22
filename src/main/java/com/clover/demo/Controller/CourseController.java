package com.clover.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clover.demo.Model.CourseEntity;
import com.clover.demo.services.CourseService;

@RestController
@RequestMapping("/Course")
public class CourseController {

	
	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public CourseEntity SaveAllData(@RequestBody CourseEntity courseEntity )
	{
		courseService.SaveAllData(courseEntity);
		
		return courseEntity;
		
	}
}
