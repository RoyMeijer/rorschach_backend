package com.ryxr.rorschach_api.repository;

import com.ryxr.rorschach_api.models.Answer;
import com.ryxr.rorschach_api.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> getAnswersByQuestions(Question question);
}
