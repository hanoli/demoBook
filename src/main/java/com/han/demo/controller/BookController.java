package com.han.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.han.demo.entity.Book;
import com.han.demo.request.BookRequest;
import com.han.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookService bookService; 
	
	@GetMapping("/books")
	public String book() {
		return "HelloWorld ApirRest";
	}
	
	@PostMapping("/books")
	public String book(@RequestBody Book book) {
		
		bookService.guardarBook(book);
		
		return "HelloWorld ApirRest";
	}
	
}
