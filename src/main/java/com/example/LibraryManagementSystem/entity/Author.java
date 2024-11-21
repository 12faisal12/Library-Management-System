package com.example.LibraryManagementSystem.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, unique = true, nullable = false)
    private String name;

    @Column(name = "description", length = 100, nullable = false)
    private String description;

    @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();

    public Author(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
