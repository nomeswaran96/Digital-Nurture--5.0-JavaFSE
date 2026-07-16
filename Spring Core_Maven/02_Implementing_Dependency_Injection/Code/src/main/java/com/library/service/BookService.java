package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    // Dependency
    private BookRepository bookRepository;

    // Setter method for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBooks() {
        System.out.println("BookService: Managing library operations...");
        // The service now relies on the injected repository to do the database work
        if (bookRepository != null) {
            bookRepository.getBooks();
        }
    }
}