package com.example.REST_API.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRegisterDto {
     private int id;
     private String name;
     private String email;
     private String password;
}
