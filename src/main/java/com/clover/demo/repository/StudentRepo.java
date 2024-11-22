package com.clover.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clover.demo.Model.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Long> { 

}
