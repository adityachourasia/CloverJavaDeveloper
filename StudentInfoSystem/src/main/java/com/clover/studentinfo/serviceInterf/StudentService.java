package com.clover.studentinfo.serviceInterf;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.clover.studentinfo.dto.StudentDto;

public interface StudentService {
	
	public ResponseEntity<String> insert(StudentDto studentDto);
	
	public List<StudentDto> getAllStudent();

}
