package com.clover.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clover.demo.Model.StudentEntity;
import com.clover.demo.services.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public StudentEntity SaveAllData(StudentEntity studentEntity)
	{
		studentEntity=studentService.SaveAllData(studentEntity);
		return studentEntity;
	}


}
