package com.ryxr.rorschach_api.controllers;

import com.ryxr.rorschach_api.models.Question;
import com.ryxr.rorschach_api.services.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class QuestionController {
    private final QuizService quizService;

    @GetMapping
    public ResponseEntity<List<Question>> getQuestions() {
        return ResponseEntity.ok(quizService.findAll());
    }

    public QuestionController(QuizService quizService) {
        this.quizService = quizService;
    }
}
