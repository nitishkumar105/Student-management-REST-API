package com.example.REST_API.service;

import com.example.REST_API.bean.Student;
import com.example.REST_API.dto.StudentInfoDto;
import com.example.REST_API.dto.StudentRegisterDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
       List<StudentInfoDto> getAllStudent();
       StudentRegisterDto register(StudentRegisterDto studentRegisterDto);

}
