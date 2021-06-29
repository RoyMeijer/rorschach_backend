package com.ryxr.rorschach_api.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AnswerDTO {
    private final String answer_text;
    private final boolean neurotypical;
}
