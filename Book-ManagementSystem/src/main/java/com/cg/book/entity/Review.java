package com.cg.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="cap_review")
public class Review {
	
		@Id
		@Column(name="review_id", length=15)
		private int reviewId;
		
		@Column(name="user_id", length=10)
		private int userId;
		
		@Column(name="book_rating")
		private int bookRating;
		
		@Column(name="headline", length=120)
		private String headline;
		
		@Column(name="comment", length=300)
		private String comment;
		
		@Column(name="book_id", length=10)
		private int bookId;
		
		@ManyToOne
		@JoinColumn(name="book_id", referencedColumnName = "book_id")
		private Review review = new Review();
		
		
		
		
		public Review(int reviewId, int userId, int bookRating, String headline, String comment, int bookId) {
			super();
			this.reviewId = reviewId;
			this.userId = userId;
			this.bookRating = bookRating;
			this.headline = headline;
			this.comment = comment;
			this.bookId = bookId;
		}


		public Review() {
			super();
			
		}
	
		
		public int getReviewId() {
			return reviewId;
		}

		public void setReviewId(int reviewId) {
			this.reviewId = reviewId;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}
		public int getBookRating() {
			return bookRating;
		}

		public void setBookRating(int bookRating) {
			this.bookRating = bookRating;
		}
		public String getHeadline() {
			return headline;
		}
		public void setHeadline(String headline) {
			this.headline = headline;
		}
		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

}
