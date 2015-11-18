package com.domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

//图书
public class Book {
	private Integer bookId;
	private String name;
	private Double price;
	private String ISBN;
	private String author;
	private String press;//出版社
	private Date publishDate;
	private String kind;
	private String info;//描述信息
	private String src;//图片保存路径

	//一本书具有多个操作信息
	private Set<Borrow> borrows = new HashSet<Borrow>();
	
	// 一个库存关联一种书
	private Repertory repertory;
	
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Set<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}
	
	public Repertory getRepertory() {
		return repertory;
	}

	public void setRepertory(Repertory repertory) {
		this.repertory = repertory;
	}

	@Override
	public String toString() {
		return "Book [id=" + bookId + ", name=" + name + ", price=" + price + "]";
	}

}
