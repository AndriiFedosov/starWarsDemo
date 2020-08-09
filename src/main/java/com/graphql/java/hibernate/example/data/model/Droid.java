package com.graphql.java.hibernate.example.data.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Droid extends FilmCharacter {
    private String primaryFunction;
}
