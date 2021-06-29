package com.ryxr.rorschach_api.services;

import com.ryxr.rorschach_api.dtos.QuestionAnswersDTO;
import com.ryxr.rorschach_api.models.Question;

public interface QuestionAnswerService {
    QuestionAnswersDTO getQuestionWithAnswers(Question question);
}
