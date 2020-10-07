package com.cg.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.book.service.BookService;
import com.cg.dao.BookDao;
import com.cg.book.entity.Book;
import com.cg.book.exception.BookException;

@Service 
public class BookServiceImpl implements BookService
{
	
	@Autowired
     BookDao  bookDao; 
	

	
	
		@Override
		public Book addBook(int categoryId,Book book) throws BookException 
		
		{
			Book books;
			
			if(book.getCategory().getCategoryId()==categoryId)
			{
				books=bookDao.saveAndFlush(book);
			}
			else
			{
				throw new BookException("Book Id doesnot exist");
			}
			return books;
		}

		
		@Override
		public List<Book> findAllBooks() throws BookException
		{
			
			List<Book> list =  bookDao.findAll();
			return list;
		}
		
}
