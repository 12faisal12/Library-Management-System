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
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "publishers", cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();

    public Publisher(String name) {
        this.name = name;
    }
}
