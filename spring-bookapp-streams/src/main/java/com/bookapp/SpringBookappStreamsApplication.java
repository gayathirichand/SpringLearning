package com.bookapp;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappStreamsApplication implements CommandLineRunner {

	private BookServiceImpl bookServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappStreamsApplication.class, args);
	}
   @Autowired
	private IBookService bookService;

   SpringBookappStreamsApplication(BookServiceImpl bookServiceImpl) {
	this.bookServiceImpl = bookServiceImpl;
   }
	
	@Override
	public void run(String... args) throws Exception {
		bookService.getAll().forEach(System.out::println);
		System.out.println("******************");
		Book book =bookService.getById(2);
		System.out.println(book);
		System.out.println("******************");

		bookService.getByTitleContains("Javascript for beginners").forEach(System.out::println);
		System.out.println("******************");
		bookService.getByAuthCategory("Joe","selfhelp").forEach(System.out::println);

		System.out.println("******************");
		bookService.getByLesserPrice(900).forEach(System.out::println);
	
	
	
	}

}
