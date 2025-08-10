package com.example.REST_API.dto;

import lombok.*;

@Data@NoArgsConstructor@AllArgsConstructor@Getter@Setter
public class LoginWithEmailDto {
     private String email;
     private String password;
}
