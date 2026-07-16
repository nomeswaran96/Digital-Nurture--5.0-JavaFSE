package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// This tells Spring to automatically create a bean for this class
@Service
public class BookService {

    // This tells Spring to automatically inject the BookRepository bean here
    @Autowired
    private BookRepository bookRepository;

    public void manageBooks() {
        System.out.println("BookService: Service logic executing via @Service annotation...");
        if (bookRepository != null) {
            bookRepository.getBooks();
        }
    }
}