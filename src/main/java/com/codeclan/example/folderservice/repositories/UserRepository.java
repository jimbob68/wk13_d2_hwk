package com.codeclan.example.folderservice.repositories;

import com.codeclan.example.folderservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
