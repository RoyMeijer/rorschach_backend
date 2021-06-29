package com.ryxr.rorschach_api.services;

import com.ryxr.rorschach_api.models.Answer;
import com.ryxr.rorschach_api.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("answerService")
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }
}
