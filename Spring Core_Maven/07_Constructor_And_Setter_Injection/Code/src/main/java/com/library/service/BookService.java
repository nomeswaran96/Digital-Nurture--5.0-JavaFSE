package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String libraryName;

    // Constructor for Constructor Injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter method for Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBooks() {
        System.out.println("BookService: Welcome to " + libraryName + " (Loaded via Constructor)");
        if (bookRepository != null) {
            bookRepository.getBooks();
        }
    }
}