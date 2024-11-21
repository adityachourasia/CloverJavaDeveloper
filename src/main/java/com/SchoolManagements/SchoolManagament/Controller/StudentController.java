package com.SchoolManagements.SchoolManagament.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolManagements.SchoolManagament.Model.StudentEntity;
import com.SchoolManagements.SchoolManagament.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
       @Autowired
       private StudentService studnetService;
       
       @GetMapping
      public List<StudentEntity> getAll()
      {
    	List<StudentEntity>  studentEntity=studnetService.getAllRecords();
    	  return studentEntity;
      }
       
       @PostMapping
       public StudentEntity SaveAllData(@RequestBody StudentEntity studentEntity) {
    	   return studnetService.SaveAllData(studentEntity);
       }
//      @PostMapping("/{studentId}/{courseId}")
//       public String registerStudentToCourse(@PathVariable Long stu_Id, @PathVariable Long course_Id) {
//           return studnetService.registerStudentToCourse(stu_Id, course_Id);
//       }
       

}
