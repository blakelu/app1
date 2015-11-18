package com.domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

//ͼ��
public class Book {
	private Integer bookId;
	private String name;
	private Double price;
	private String ISBN;
	private String author;
	private String press;//������
	private Date publishDate;
	private String kind;
	private String info;//������Ϣ
	private String src;//ͼƬ����·��

	//һ������ж��������Ϣ
	private Set<Borrow> borrows = new HashSet<Borrow>();
	
	// һ��������һ����
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
