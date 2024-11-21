package com.studentdemo.StudentServiceDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdemo.StudentServiceDemo.entity.Course;
import com.studentdemo.StudentServiceDemo.repo.CurseRepo;

@Service
public class CourseService {
	
	@Autowired
	CurseRepo cr;
	
	public Course addCourse(Course c)
	{
		return cr.save(c);	
	}

}
