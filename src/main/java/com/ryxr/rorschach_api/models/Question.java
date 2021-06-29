package com.ryxr.rorschach_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name = "questions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Question extends EntityWithId {
    @NotNull
    private int number;
    @NotNull
    private String imgPath;
}
