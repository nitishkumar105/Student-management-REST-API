package com.example.REST_API.controller;

import com.example.REST_API.bean.Student;
import com.example.REST_API.dto.StudentInfoDto;
import com.example.REST_API.dto.StudentLoginDto;
import com.example.REST_API.dto.StudentRegisterDto;
import com.example.REST_API.repository.StudentRepository;
import com.example.REST_API.service.StudentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/student")
public class StudentController {
         //  @Autowired
        private final StudentService studentService;
             public StudentController(StudentService studentService){
                 this.studentService=studentService;
             }
//    @GetMapping("/student")
//    public Student getStudent(){
//         return new Student(1,"nitish","nk@gmail.com","nk@123");
//
//    }
          @GetMapping
          public ResponseEntity<List<StudentInfoDto>> getAllStudents() {
              List<StudentInfoDto> studentInfoDto= studentService.getAllStudent();
              return ResponseEntity.ok(studentInfoDto);
          }

    @PostMapping("/register")
    public ResponseEntity<StudentRegisterDto> registerStudent(@RequestBody StudentRegisterDto studentRegisterDto){
        StudentRegisterDto studentRegisterDto1=  studentService.register(studentRegisterDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)      // 201 Created
                .body(studentRegisterDto1);
    }



    @PostMapping("/login")
    public ResponseEntity<StudentInfoDto> login(@RequestBody StudentLoginDto loginDto) {
        return studentService.login(loginDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body(null)); // No type conflict
    }


}
