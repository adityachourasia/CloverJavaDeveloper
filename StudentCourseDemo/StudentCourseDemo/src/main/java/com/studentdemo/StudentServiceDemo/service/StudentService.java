package com.studentdemo.StudentServiceDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdemo.StudentServiceDemo.entity.Student;
import com.studentdemo.StudentServiceDemo.repo.StdRepo;

@Service
public class StudentService {

	@Autowired
	StdRepo sr;
	
	public Student addStudent(Student s)
	{
		return sr.save(s);
		
	}
	
	public List<Student> getAllStudents()
	{
		return sr.findAll();		
	}
}
