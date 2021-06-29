package com.ryxr.rorschach_api.controllers;

import com.ryxr.rorschach_api.dtos.QuestionAnswersDTO;
import com.ryxr.rorschach_api.dtos.QuestionsDTO;
import com.ryxr.rorschach_api.models.Question;
import com.ryxr.rorschach_api.services.QuestionAnswerService;
import com.ryxr.rorschach_api.services.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/questions")
public class QuestionController {
    private final QuestionService questionService;
    private final QuestionAnswerService questionAnswerService;

    @GetMapping
    public ResponseEntity<QuestionsDTO> getQuestions() {
        List<Question> questions = questionService.findAll();
        List<QuestionAnswersDTO> questionAnswerDTOS = new ArrayList<>();
        questions.forEach(question -> questionAnswerDTOS.add(questionAnswerService.getQuestionWithAnswers(question)));
        QuestionsDTO questionsDTO = new QuestionsDTO();
        questionsDTO.setQuestions(questionAnswerDTOS);
        return ResponseEntity.ok(questionsDTO);
    }

    public QuestionController(QuestionService questionService, QuestionAnswerService questionAnswerService) {
        this.questionService = questionService;
        this.questionAnswerService = questionAnswerService;
    }
}
