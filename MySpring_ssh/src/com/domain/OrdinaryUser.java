package com.domain;

import java.util.HashSet;
import java.util.Set;

//����
public class OrdinaryUser {
	private Integer ordinaryUserId;
	private String username;
	private String password;
	private String studentName;//��ͨ�û����� ����
	private String studentId;//ѧ��
	private String studentAge;
	private double balance;
	private Integer limit;
	
	//һ����ͨ�û����ж��������Ϣ
	private Set<Borrow> borrows = new HashSet<Borrow>();
	public Integer getOrdinaryUserId() {
		return ordinaryUserId;
	}
	public void setOrdinaryUserId(Integer ordinaryUserId) {
		this.ordinaryUserId = ordinaryUserId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Set<Borrow> getBorrows() {
		return borrows;
	}
	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}
	
}
