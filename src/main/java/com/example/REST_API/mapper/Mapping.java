package com.example.REST_API.mapper;

import com.example.REST_API.bean.Student;
import com.example.REST_API.dto.StudentInfoDto;
import com.example.REST_API.dto.StudentRegisterDto;
import org.hibernate.tool.schema.spi.SchemaTruncator;

public class Mapping {

    public static StudentRegisterDto  studentToStudentRegisterDto(Student student){
        return new StudentRegisterDto(student.getId(), student.getName(), student.getEmail(), student.getPassword());
    }
     public static StudentInfoDto studentToStudentInfoDto(Student student){
           return new StudentInfoDto(student.getId(), student.getName(), student.getEmail());
     }
      public static Student studentRegisterDtoToStudent(StudentRegisterDto studentRegisterDto){
          return new Student(studentRegisterDto.getId(),studentRegisterDto.getName(),studentRegisterDto.getEmail(),studentRegisterDto.getPassword());
      }
       public static Student studentInfoDtoToStudent(StudentInfoDto studentInfoDto){
          return new Student(studentInfoDto.getId(),studentInfoDto.getName(),studentInfoDto.getEmail(), null  );
       }
}
