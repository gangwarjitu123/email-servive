package com.email.email_service.domain.repository;

import com.email.email_service.domain.UserEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEmail, Long> {

}