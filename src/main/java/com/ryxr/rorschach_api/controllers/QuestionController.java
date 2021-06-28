package com.ryxr.rorschach_api.controllers;

import com.ryxr.rorschach_api.models.Question;
import com.ryxr.rorschach_api.services.QuestionService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/questions")
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getQuestions() {
//        List<Question> questions = questionService.findAll();
        return ResponseEntity.ok("questions");
    }

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
}
