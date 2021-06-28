package com.ryxr.rorschach_api.services;

import com.ryxr.rorschach_api.models.Question;
import com.ryxr.rorschach_api.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("quizService")
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }
}
