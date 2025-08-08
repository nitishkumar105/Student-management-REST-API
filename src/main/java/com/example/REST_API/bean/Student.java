package com.example.REST_API.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")
@Entity
public class Student {

        @Id
      private    int id;
      private String name;
      private  String email;
      private String password;

}
