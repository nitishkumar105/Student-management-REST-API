package com.example.REST_API.dto;


import lombok.*;

@Data@AllArgsConstructor@NoArgsConstructor@Getter@Setter
public class StudentLoginDto {
      private Long id;
      private String password;
}
