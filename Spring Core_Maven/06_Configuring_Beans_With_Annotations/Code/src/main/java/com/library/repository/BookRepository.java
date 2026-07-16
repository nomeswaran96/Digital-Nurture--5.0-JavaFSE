package com.library.repository;

import org.springframework.stereotype.Repository;

// This tells Spring to automatically create a bean for this class
@Repository
public class BookRepository {
    public void getBooks() {
        System.out.println("BookRepository: Database access initialized via @Repository annotation.");
    }
}