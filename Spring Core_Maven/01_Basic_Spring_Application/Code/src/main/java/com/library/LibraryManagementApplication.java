package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the configured beans
        BookRepository repository = (BookRepository) context.getBean("bookRepository");
        BookService service = (BookService) context.getBean("bookService");

        // Test the configuration
        repository.getBooks();
        service.manageBooks();
    }
}
