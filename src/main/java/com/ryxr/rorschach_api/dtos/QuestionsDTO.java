package com.ryxr.rorschach_api.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class QuestionsDTO {
    List<QuestionAnswersDTO> questions;
}
