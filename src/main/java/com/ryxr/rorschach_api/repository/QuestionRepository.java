package com.ryxr.rorschach_api.repository;

import com.ryxr.rorschach_api.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
