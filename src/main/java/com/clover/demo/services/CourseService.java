package com.clover.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.demo.Model.CourseEntity;
import com.clover.demo.repository.CourseRepo;

@Service
public class CourseService {
	
	
	@Autowired
    private CourseRepo courseRepo;
	
	
	public CourseEntity SaveAllData(CourseEntity courseEntity)
	{
		courseEntity=courseRepo.save(courseEntity);
		return courseEntity;
	}

}
