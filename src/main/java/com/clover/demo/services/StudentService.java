package com.clover.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.demo.Model.StudentEntity;
import com.clover.demo.repository.StudentRepo;



@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	

	
	
	public StudentEntity SaveAllData(StudentEntity studentEntity)
	{
		studentEntity=studentRepo.save(studentEntity);
		return studentEntity;
	}
	
	public List<StudentEntity> getAllRecords() {
		List<StudentEntity>	studentEntity=studentRepo.findAll();
		return studentEntity;
		
	}
}
