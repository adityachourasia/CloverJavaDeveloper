package com.clover.studentinfo.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.clover.studentinfo.dao.CourseRepository;
import com.clover.studentinfo.dao.StudentRepository;
import com.clover.studentinfo.dto.Course;
import com.clover.studentinfo.dto.StudentDto;
import com.clover.studentinfo.entity.CourseEntity;
import com.clover.studentinfo.entity.StudentEntity;
import com.clover.studentinfo.serviceInterf.StudentService;

@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CourseRepository courseRepository;

	@Override
	public ResponseEntity<String> insert(StudentDto studentDto) {

		StudentEntity studentEntity = new StudentEntity();
		CourseEntity courseEntity = new CourseEntity();
		BeanUtils.copyProperties(studentDto, studentEntity);
		BeanUtils.copyProperties(studentDto.getStudCourse().get(0), courseEntity);
		studentEntity.setUpdated_at(LocalDateTime.now());
		studentEntity.setCreated_at(LocalDateTime.now());
		CourseEntity save1 = courseRepository.save(courseEntity);
		List<CourseEntity> courseList = new ArrayList<>();
		courseList.add(save1);
		studentEntity.setStudCourse(courseList);
		StudentEntity save = studentRepository.save(studentEntity);
		if (save != null) {

			System.out.println("Data inserted successfully");

			return new ResponseEntity<>("Data inserted successfully", HttpStatus.CREATED);

		} else {

			System.out.println("Data insertion failed");
			return new ResponseEntity<>("Data Insertion Failed", HttpStatus.BAD_REQUEST);
		}

	}

	@Override
	public List<StudentDto> getAllStudent() {
		List<StudentEntity> allRecord = studentRepository.findAll();
		System.out.println(allRecord);
		List<StudentDto> studentDtos = new ArrayList<>();
		allRecord.forEach(record -> {
			StudentDto studentDto = new StudentDto();
			Course course = new Course();
			CourseEntity courseEntity = record.getStudCourse().get(0);
			BeanUtils.copyProperties(courseEntity, course);
			System.out.println("**** " + courseEntity);
			BeanUtils.copyProperties(record, studentDto);
			studentDto.setStudCourse(Arrays.asList(course));
			studentDtos.add(studentDto);

		});
		return studentDtos;
	}

}
