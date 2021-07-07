package com.ryxr.rorschach_api.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "countries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    @Id
    private int id;

    @NotNull
    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "alpha_2", columnDefinition = "char")
    private char alpha2;

    @Column(name = "alpha_3", columnDefinition = "char")
    private char alpha3;
}
