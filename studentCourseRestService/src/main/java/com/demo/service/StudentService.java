package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Course;
import com.demo.entity.Student;
import com.demo.repository.CourseRepo;
import com.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private CourseRepo courseRepo;

	public List<Course> getCourseDetail(Integer studentId) {
	/*
	 * return studentRepo.findById(studentId).map(Student::getCourse)
	 * 
	 * .orElseThrow(() -> new RuntimeException("StudentDetail is not found")); }
	 */
		
		return studentRepo.findById(studentId).map(Student::getCourses).orElseThrow(()-> new RuntimeException("Student Details is not found"));
	}

	public void addCourse(Integer studentId, Integer courseId) {
		Student student = studentRepo.findById(studentId)
				.orElseThrow(() -> new RuntimeException("StudentDetail is not found"));
		Course course = courseRepo.findById(courseId)
				.orElseThrow(() -> new RuntimeException("CourseDetail is not found"));

		student.getCourses().add(course);
		studentRepo.save(student);
	}

}
