package com.ryxr.rorschach_api.controllers;

import com.ryxr.rorschach_api.models.Answer;
import com.ryxr.rorschach_api.services.AnswerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/answers")
public class AnswerController {
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    public ResponseEntity<List<Answer>> getAll() {
        return ResponseEntity.ok(answerService.findAll());
    }

}
