package com.ryxr.rorschach_api.services;

import com.ryxr.rorschach_api.models.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();
}
