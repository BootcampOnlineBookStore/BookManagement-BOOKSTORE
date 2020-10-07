
package com.cg.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.book.entity.Book;
import com.cg.book.entity.Category;
import com.cg.book.exception.BookException;
import com.cg.book.service.BookService;

@RestController

public class BookController
{

	@Autowired
	BookService  bookService;

		@GetMapping("books")
		public ResponseEntity<List<Book>>  findAllBook() throws BookException
		{
			List<Book> listBooks = bookService.findAllBooks();
			ResponseEntity<List<Book>>  rt = new ResponseEntity<List<Book>>(listBooks,HttpStatus.OK);
			return rt;	
		}
		
	@PostMapping("books/category/{categoryId}")
	public ResponseEntity<Book> addBook(@PathVariable("categoryId")int categoryId,@RequestBody Book book) throws BookException 
	{
		Category category =new Category();
		category.setCategoryId(categoryId);
		book.setCategory(category);
		Book boo= bookService.addBook(categoryId, book);
		ResponseEntity<Book> re = new ResponseEntity<Book>(boo, HttpStatus.OK);
		return re;
	}
	

	
}