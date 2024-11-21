package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Author;
import com.example.LibraryManagementSystem.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors(){
        return authorRepository.findAll();
    }

    public Author findAuthorById(Long id){
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author Not Found"));
    }

    public void createAuthor(Author author){
        authorRepository.save(author);
    }

    public void updateAuthor(Author author){
        authorRepository.save(author);
    }

    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }


}
