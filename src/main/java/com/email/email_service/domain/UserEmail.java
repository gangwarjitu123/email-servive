package com.email.email_service.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "user_email")
@Data
public class UserEmail {

    @Column(name = "email")
    private String email;

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
}
