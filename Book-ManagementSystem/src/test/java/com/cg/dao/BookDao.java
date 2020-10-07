package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.book.entity.Book;

public interface BookDao extends JpaRepository<Book,Integer>
{
	

}
