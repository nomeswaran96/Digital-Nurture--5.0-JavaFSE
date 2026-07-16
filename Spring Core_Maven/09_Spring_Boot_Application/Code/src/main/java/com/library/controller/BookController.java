package com.library.controller;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    // Constructor Injection
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Read all books (GET)
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Create a new book (POST)
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}