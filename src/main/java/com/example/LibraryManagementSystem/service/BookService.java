package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    public Book findBookById(Long id){
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book Not Found"));
    }

    public void createBook(Book book){
        bookRepository.save(book);
    }

    public void deleteBook(Long id){
        Book book =  bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book Not Found"));
        bookRepository.deleteById(id);

    }

    public void updateBook(Book book){
        bookRepository.save(book);
    }




}
