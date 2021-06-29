package com.ryxr.rorschach_api.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionAnswersDTO {
    int question_number;
    String img_path;
    String correct_answer;
    List<AnswerDTO> answers;
}
