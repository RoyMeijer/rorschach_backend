package com.ryxr.rorschach_api.services;

import com.ryxr.rorschach_api.dtos.AnswerDTO;
import com.ryxr.rorschach_api.dtos.QuestionAnswersDTO;
import com.ryxr.rorschach_api.models.Answer;
import com.ryxr.rorschach_api.models.Question;
import com.ryxr.rorschach_api.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("questionAnswerService")
public class QuestionAnswerServiceImpl implements QuestionAnswerService {
    private final AnswerRepository answerRepository;

    public QuestionAnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public QuestionAnswersDTO getQuestionWithAnswers(Question question) {
        QuestionAnswersDTO questionWithAnswers = new QuestionAnswersDTO();
        questionWithAnswers.setQuestion_number(question.getNumber());
        questionWithAnswers.setCorrect_answer("An army or navy emblem");
        List<AnswerDTO> answerDTOList = new ArrayList<>();

        List<Answer> answers = answerRepository.getAnswersByQuestions(question);
        answers.forEach(answer -> answerDTOList.add(new AnswerDTO(answer.getAnswerText(), true)));
        questionWithAnswers.setAnswers(answerDTOList);

        return questionWithAnswers;
    }
}
