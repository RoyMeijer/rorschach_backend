package com.ryxr.rorschach_api.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "user_answers")
@Getter
@Setter
public class UserAnswer {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_user_answers_answers"))
    Answer answer;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_user_answers"))
    User user;

    String reason;
}
