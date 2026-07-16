package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // We only need to retrieve the Service now
        BookService service = (BookService) context.getBean("bookService");

        // Calling the service will automatically trigger the repository because Spring injected it!
        service.manageBooks();
    }
}
