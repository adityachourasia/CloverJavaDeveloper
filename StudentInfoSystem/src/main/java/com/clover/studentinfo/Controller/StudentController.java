package com.clover.studentinfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clover.studentinfo.dto.StudentDto;
import com.clover.studentinfo.serviceInterf.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/create")
	public ResponseEntity<String> createRecord(@RequestBody StudentDto studentDto) {

		ResponseEntity<String> insert = studentService.insert(studentDto);
		return insert;

	}

	@GetMapping("/getall")
	public List<StudentDto> getAllStudent() {

		List<StudentDto> allStudent = studentService.getAllStudent();

		return allStudent;
	}

}
