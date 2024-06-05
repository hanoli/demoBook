package com.han.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.han.demo.entity.Book;
import com.han.demo.repository.BookRepository;
import com.han.demo.request.BookRequest;
import com.han.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> guardarBook(Book book) {
		
		
		return (List<Book>) bookRepository.save(book);
		
		
	}
	

}
