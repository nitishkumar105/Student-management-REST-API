package com.example.REST_API.service.serviceImpl;

import com.example.REST_API.bean.Student;
import com.example.REST_API.dto.LoginWithEmailDto;
import com.example.REST_API.dto.StudentInfoDto;
import com.example.REST_API.dto.StudentLoginDto;
import com.example.REST_API.dto.StudentRegisterDto;
import com.example.REST_API.mapper.Mapping;
import com.example.REST_API.repository.StudentRepository;
import com.example.REST_API.service.StudentService;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


     private final  StudentRepository studentRepository;

    @Override
    public List<StudentInfoDto> getAllStudent() {

        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(Mapping::studentToStudentInfoDto)
                .collect(Collectors.toList());
    }

    @Override
    public StudentRegisterDto register(StudentRegisterDto studentRegisterDto) {
        Student student = Mapping.studentRegisterDtoToStudent(studentRegisterDto);
        Student savedStudent = studentRepository.save(student);
        return Mapping.studentToStudentRegisterDto(savedStudent);
    }


    @Override
    public Optional<StudentInfoDto> login(StudentLoginDto studentLoginDto) {
        return studentRepository.findByIdAndPassword(
                studentLoginDto.getId(),
                studentLoginDto.getPassword()
        ).map(Mapping::studentToStudentInfoDto);
    }

    @Override
    public Optional<StudentInfoDto> loginWithEmail(LoginWithEmailDto loginWithEmailDto) {
        return studentRepository
                .findByEmailAndPassword(loginWithEmailDto.getEmail(), loginWithEmailDto.getPassword())
                .map(Mapping::studentToStudentInfoDto); // returns Optional<StudentInfoDto>
    }


}
