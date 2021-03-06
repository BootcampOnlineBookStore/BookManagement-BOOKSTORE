package com.cg.book.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "book_tbl")
public class Book 
{
	
	@Id
	@Column(name = "book_id")
	@GeneratedValue(generator = "book_seq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "book_seq",sequenceName = "book_seq",allocationSize = 1)
	private int bookId;
	
	@Column(name = "book_title",length = 20)
	private String bookTitle;
	
	@Column(name = "book_author",length = 20)
	private String bookAuthor;
	
	@Column(name = "book_price")
	private double bookPrice;
	
	@Column(name = "book_isbn",length = 20)
	private String bookISBN;
	
	@Column(name = "book_updatedOn")
	private LocalDate bookUpdatedOn;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "customer_id")
	private Category category;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public LocalDate getBookUpdatedOn() {
		return bookUpdatedOn;
	}

	public void setBookUpdatedOn(LocalDate bookUpdatedOn) {
		this.bookUpdatedOn = bookUpdatedOn;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
