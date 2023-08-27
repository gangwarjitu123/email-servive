package com.email.email_service.controller;

import com.email.email_service.domain.UserEmail;
import com.email.email_service.domain.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/save-email")
    public ResponseEntity<String> saveEmail(@RequestParam String email) {
        try {
            UserEmail user = new UserEmail();
            user.setEmail(email);
            userRepository.save(user);
            return ResponseEntity.ok("Email saved successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving email");
        }
    }
}