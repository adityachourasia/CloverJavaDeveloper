package com.clover.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clover.demo.Model.CourseEntity;

@Repository
public interface CourseRepo extends JpaRepository<CourseEntity, Long> {

}
