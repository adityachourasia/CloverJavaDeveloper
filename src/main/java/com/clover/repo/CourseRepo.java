package com.clover.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clover.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
	
	

}
