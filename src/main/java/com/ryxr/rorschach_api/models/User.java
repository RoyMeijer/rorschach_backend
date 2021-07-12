package com.ryxr.rorschach_api.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;
import java.util.UUID;

@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
public class User {

    @Id
    @Type(type = "pg-uuid")
    UUID id;

    @Positive
    @Max(150)
    Integer age;

    @JoinColumn(name = "country_id", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;


    public User() {
        this.id = UUID.randomUUID();
    }
}
