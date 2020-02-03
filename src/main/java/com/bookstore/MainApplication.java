package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.mainAuthor();
        };
    }
}

/*
 * 
 * 
 * 
 * Why the @Transactional annotation is being ignored

Description: This application is an example of fixing the case when @Transactional annotation is ignored. Most of the time, this annotation is ignored in the following scenarios:

@Transactional was added to a private, protected or package-protected method
@Transactional was added to a method defined in the same class where it is invoked
Key points:

write a helper service and move the @Transactional methods there
ensure that these methods are declared as public
call @Transactional methods from other services

 * 
 */
