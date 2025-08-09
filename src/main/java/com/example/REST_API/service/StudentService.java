package com.example.REST_API.service;

import com.example.REST_API.bean.Student;
import com.example.REST_API.dto.StudentInfoDto;
import com.example.REST_API.dto.StudentLoginDto;
import com.example.REST_API.dto.StudentRegisterDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
       List<StudentInfoDto> getAllStudent();
       StudentRegisterDto register(StudentRegisterDto studentRegisterDto);
        Optional<StudentInfoDto> login(StudentLoginDto studentLoginDto);
}
