package com.ryxr.rorschach_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name ="answers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
public class Answer extends EntityWithId {
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_answers_questions"))
    private Question questions;
    private String answerText;
}
