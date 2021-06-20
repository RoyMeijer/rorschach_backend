package com.ryxr.rorschach_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name = "questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question extends EntityWithUUID {
    private int number;
    private String imgPath;
}
