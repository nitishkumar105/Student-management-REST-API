package com.example.REST_API.repository;

import com.example.REST_API.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student> findByIdAndPassword(Long id,String password);
    Optional<Student> findByEmailAndPassword(String email,String password);
}
