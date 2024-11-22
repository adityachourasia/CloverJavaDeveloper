package com.clover.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clover.model.Course;
import com.clover.model.Student;
import com.clover.service.StudentService;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping    // savenewstudent
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PostMapping("/{studentId}/registerCourse/{courseId}")
    public Student registerStudentForCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
        return studentService.registerCourse(studentId, courseId);
    }

    @GetMapping("/{studentId}/courses")
    public Student getStudentCourses(@PathVariable Long studentId) {
        return studentService.getStudentCourses(studentId);
    }

    @PostMapping("/courses")   //savenewcourse
    public Course createCourse(@RequestBody Course course) {
        return studentService.createCourse(course);
    }

    @GetMapping("/getallstudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping("/getallcourses")
    public List<Course> getAllCourses() {
        return studentService.getAllCourses();
    }
}
