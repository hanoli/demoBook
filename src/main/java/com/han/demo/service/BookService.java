package com.han.demo.service;

import java.util.List;

import com.han.demo.entity.Book;
import com.han.demo.request.BookRequest;

public interface BookService {
	
	public List<Book> guardarBook(Book book);

}
