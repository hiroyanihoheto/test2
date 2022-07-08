package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;

	@Column(name = "isbn")
	private int isbn;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "auther")
	private String auther;

	@Column(name = "category_code")
	private int catCode;

	@Column(name = "quality_code")
	private int qualCode;

	@Column(name = "price")
	private int price;

	@Column(name = "stock_flag")
	private char stockFlag;

	@Column(name = "note")
	private String note;

	@Column(name = "seller_id")
	private int sellerId;

	@Column(name = "create_date")
	private int createDate;

	@Column(name = "image")
	private String image;

	public Book() {
	}

	public Book(
			int bookId,
			int isbn,
			String bookName,
			String auther,
			int catCode,
			int qualCode,
			int price,
			char stockFlag,
			String note,
			int sellerId,
			int createDate,
			String image
			) {
		this.bookId = bookId;
		this.isbn = isbn;
		this.bookName = bookName;
		this.auther = auther;
		this.catCode = catCode;
		this.qualCode = qualCode;
		this.price = price;
		this.stockFlag = stockFlag;
		this.note = note;
		this.sellerId = sellerId;
		this.createDate = createDate;
		this.image = image;
	}

	public Integer getBookId() {
		return bookId;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public String autther() {
		return auther;
	}

	public Integer getCatCode() {
		return catCode;
	}

	public Integer getQualCode() {
		return qualCode;
	}

	public Integer getPrice() {
		return price;
	}

	public char getStockFlag() {
		return stockFlag;
	}

	public String getNote() {
		return note;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public Integer getcreateDate() {
		return createDate;
	}

	public String getImage() {
		return image;
	}
}
