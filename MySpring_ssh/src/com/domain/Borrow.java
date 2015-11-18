package com.domain;

import java.sql.Date;
//���ļ�¼
public class Borrow {
	private Integer borrowId;
	private Integer bookId;// ���ʱ�׼ͼ����
	private Integer managerId;//����Ա���
	private String studentId;//ѧ��
	private Boolean isReturn;
	private Date lendDate;
	private Date returnDate;
	//һ��������Ϣ��Ӧһ������Ա
	private ManagerUser managerUser;
	
	//һ��������Ϣ��Ӧһ������
	private OrdinaryUser ordinaryUser;
	
	//һ��������Ϣ��Ӧһ����
	private Book book;
	public Integer getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(Integer borrowId) {
		this.borrowId = borrowId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentID) {
		this.studentId = studentID;
	}
	public boolean getIsReturn() {
		return isReturn;
	}
	public void setIsReturn(Boolean isReturn) {
		this.isReturn = isReturn;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public ManagerUser getManagerUser() {
		return managerUser;
	}
	public void setManagerUser(ManagerUser managerUser) {
		this.managerUser = managerUser;
	}
	public OrdinaryUser getOrdinaryUser() {
		return ordinaryUser;
	}
	public void setOrdinaryUser(OrdinaryUser ordinaryUser) {
		this.ordinaryUser = ordinaryUser;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	
}
