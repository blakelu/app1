package com.domain;

//Õº È
public class Book {
	private Integer bookId;
	private String name;
	private Double price;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + bookId + ", name=" + name + ", price=" + price + "]";
	}

}
