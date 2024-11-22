package com.clover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.model.Course;
import com.clover.model.Student;
import com.clover.repo.CourseRepo;
import com.clover.repo.StudentRepo;

import java.util.List;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private CourseRepo courseRepo;

	public Student registerCourse(Long studentId, Long courseId) {
		Student student = studentRepo.findById(studentId).orElse(null);
		Course course = courseRepo.findById(courseId).orElse(null);

		if (student == null || course == null) {
			return null;
		}

		student.getCourses().add(course);
		return studentRepo.save(student);

	}

	public Student getStudentCourses(Long studentId) {
		return studentRepo.findById(studentId).orElse(null);
	}

	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

	public Course createCourse(Course course) {
		return courseRepo.save(course);
	}

	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}


	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

}
