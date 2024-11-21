package com.studentdemo.StudentServiceDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentdemo.StudentServiceDemo.entity.Course;

public interface CurseRepo extends JpaRepository<Course, Integer> {

}
