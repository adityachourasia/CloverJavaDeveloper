package com.SchoolManagements.SchoolManagament.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolManagements.SchoolManagament.Model.CourseEntity;
import com.SchoolManagements.SchoolManagament.Service.CourseService;

@RestController
@RequestMapping("/Course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping
	public List <CourseEntity> getAllData()
	
	{
		return courseService.getAllData();
	}
	
	
	@PostMapping("/Save")
	public CourseEntity SaveAllData(@RequestBody CourseEntity courseEntity)
	{
		courseService.SaveAllData(courseEntity);
		
		return courseEntity;
	}
	
	
}
