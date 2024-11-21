	package com.studentdemo.StudentServiceDemo.controller;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	
	import com.studentdemo.StudentServiceDemo.entity.Student;
	import com.studentdemo.StudentServiceDemo.service.StudentService;
	
	@RestController
	@RequestMapping("/student")
	public class StudentController {
	
		@Autowired
		StudentService ss;
		
		@PostMapping("/addStd")
		public Student addStd(@RequestBody Student s)
		{
			return ss.addStudent(s);
			
		}
		
		@GetMapping("/std")
		public List<Student> getAllStudent()
		{
			return ss.getAllStudents();
			
		}
	}
