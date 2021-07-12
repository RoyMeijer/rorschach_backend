package com.ryxr.rorschach_api.repository;

import com.ryxr.rorschach_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
