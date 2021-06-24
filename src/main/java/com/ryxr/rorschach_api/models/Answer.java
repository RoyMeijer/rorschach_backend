package com.ryxr.rorschach_api.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name ="answers")
@AllArgsConstructor
@NoArgsConstructor
public class Answer extends EntityWithId {
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_answers_questions"))
    private Question questions;
    private String answerText;
}
