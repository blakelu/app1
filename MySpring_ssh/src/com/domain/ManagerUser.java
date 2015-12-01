package com.domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

//����Ա�û�
public class ManagerUser {
	private Integer managerId;
	private String username;
	private String password;
	private String managerName;//����Ա���� ����
	private String managerAge;
	private String managerPho;//����Ա�ֻ��� ����
	private String managerIdNo;//����Ա���֤�� ����
	private String managerNo;//����Ա֤���� �Զ����ɣ�������д�� ��ʽ ������+���֤����λ
	private String registDate;
	private Boolean isManager;//�Ƿ�ӵ����ͨ����Ա
	private Boolean isSuperManager;//�Ƿ��ǳ�������Ա ����ע����������Ա���ܣ�Ĭ���˺����룩 ע��ʱ�Զ�����false
	//һ������Ա���ж��������Ϣ
	private Set<Borrow> borrows = new HashSet<Borrow>();
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
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
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerAge() {
		return managerAge;
	}
	public void setManagerAge(String managerAge) {
		this.managerAge = managerAge;
	}
	public String getManagerPho() {
		return managerPho;
	}
	public void setManagerPho(String managerPho) {
		this.managerPho = managerPho;
	}
	public String getManagerIdNo() {
		return managerIdNo;
	}
	public void setManagerIdNo(String managerIdNo) {
		this.managerIdNo = managerIdNo;
	}
	public String getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(String managerNo) {
		this.managerNo = managerNo;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public boolean getIsManager() {
		return isManager;
	}
	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
	public boolean getIsSuperManager() {
		return isSuperManager;
	}
	public void setIsSuperManager(Boolean isSuperManager) {
		this.isSuperManager = isSuperManager;
	}
	public Set<Borrow> getBorrows() {
		return borrows;
	}
	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}

	@Override
	public String toString() {
		return "ManagerUser [managerId=" + managerId + ", username=" + username
				+ ", password=" + password + ", managerName=" + managerName
				+ ", managerAge=" + managerAge + ", managerPho=" + managerPho
				+ ", managerIdNo=" + managerIdNo + ", managerNo=" + managerNo
				+ ", isManager=" + isManager + ", isSuperManager="
				+ isSuperManager + ", borrows=" + borrows + "]";
	}
	
}
