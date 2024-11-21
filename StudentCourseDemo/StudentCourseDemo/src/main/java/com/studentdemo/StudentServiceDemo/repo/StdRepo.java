package com.studentdemo.StudentServiceDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentdemo.StudentServiceDemo.entity.Student;

public interface StdRepo extends JpaRepository<Student, Integer>{

}
