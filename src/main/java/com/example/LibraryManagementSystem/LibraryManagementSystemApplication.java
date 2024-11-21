package com.example.LibraryManagementSystem;

import com.example.LibraryManagementSystem.entity.Author;
import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.entity.Category;
import com.example.LibraryManagementSystem.entity.Publisher;
import com.example.LibraryManagementSystem.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService){
		return (args) -> {
			Book book1 = new Book("ABC", "Book1", "first book");
			Author author1 = new Author("Author1", "first author");
			Category category1 = new Category("category1");
			Publisher publisher1 = new Publisher("publisher1");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2 = new Book("DEF", "Book2", "second book");
			Author author2 = new Author("Author2", "second author");
			Category category2 = new Category("category2");
			Publisher publisher2 = new Publisher("publisher2");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);

			Book book3 = new Book("GHI", "Book3", "third book");
			Author author3 = new Author("Author3", "third author");
			Category category3 = new Category("category3");
			Publisher publisher3 = new Publisher("publisher3");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookService.createBook(book3);
		};
	}
}
