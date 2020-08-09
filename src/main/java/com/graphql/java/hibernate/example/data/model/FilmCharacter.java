package com.graphql.java.hibernate.example.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
public abstract class FilmCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "characterFriend", joinColumns = @JoinColumn(name = "characterId"))
    @Column(name = "friendId")
    private Set<Long> friendsIds;

    @ElementCollection(targetClass = Episode.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "movieAppearance")
    @Column(name = "episode")
    private Set<Episode> appearsIn;
}
