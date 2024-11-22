package com.student.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDto;

@RestController
public class StudentRestController {

	@PostMapping("/register")
	public String AddStudent(@RequestBody StudentDto student) {
	
		System.out.println(student);
		String msg="student data saved";
		return msg;
	}
	@GetMapping("/getdata/{id}")
	public String getStudent(@PathVariable Integer id) {
		System.out.println(id);
		return "student fetched";
	}
}
