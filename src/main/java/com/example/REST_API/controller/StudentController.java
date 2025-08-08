package com.example.REST_API.controller;

import com.example.REST_API.bean.Student;
import com.example.REST_API.dto.StudentInfoDto;
import com.example.REST_API.dto.StudentRegisterDto;
import com.example.REST_API.repository.StudentRepository;
import com.example.REST_API.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/student")
public class StudentController {
           @Autowired
        private  StudentService studentService;
//    @GetMapping("/student")
//    public Student getStudent(){
//         return new Student(1,"nitish","nk@gmail.com","nk@123");
//
//    }
          @GetMapping
          public List<StudentInfoDto> getAllStudents() {
              return studentService.getAllStudent();  // for this to work, modify service method as discussed earlier
          }

         @PostMapping("/register")
         public StudentRegisterDto registerStudent(@RequestBody StudentRegisterDto studentRegisterDto){
             return   studentService.register(studentRegisterDto);
         }

}
