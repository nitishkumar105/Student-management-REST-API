package com.example.REST_API.mapper;

import com.example.REST_API.bean.Student;
import com.example.REST_API.dto.StudentInfoDto;
import com.example.REST_API.dto.StudentRegisterDto;

public class Mapping {

    public static StudentRegisterDto  studentToStudentRegisterDto(Student student){
        return new StudentRegisterDto(student.getId(), student.getName(), student.getEmail(), student.getPassword());
    }
     public static StudentInfoDto studentToStudentInfoDto(Student student){
           return new StudentInfoDto(student.getId(), student.getName(), student.getEmail());
     }
      public static Student studentRegisterDtoToStudent(StudentRegisterDto studentRegisterDto){
          return new Student(null,studentRegisterDto.getName(),studentRegisterDto.getEmail(),studentRegisterDto.getPassword());
      }




}
