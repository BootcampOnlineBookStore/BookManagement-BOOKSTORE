package com.cg.book.service;

import java.util.List;

import com.cg.book.entity.Book;
import com.cg.book.exception.BookException;

public interface BookService
{
	//add books
		public Book addBook(int categoryId,Book book) throws BookException;
		
		public List<Book>  findAllBooks() throws BookException;
	
}
