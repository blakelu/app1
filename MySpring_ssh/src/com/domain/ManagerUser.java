package com.domain;

//�û�
public class ManagerUser {
	private Integer managerId;
	private String username;
	private String password;
	private String managerName;//����Ա���� ����
	private String managerAge;
	private String managerPho;//����Ա�ֻ��� ����
	private String managerIdNo;//����Ա���֤�� ����
	private String managerNo;//����Ա֤���� �Զ����ɣ�������д�� ��ʽ ������+���֤����λ
	private boolean isManager;//�Ƿ�����ͨ����Ա
	private boolean isSuperManager;//�Ƿ��ǳ�������Ա ����ע����������Ա���ܣ�Ĭ���˺����룩 ע��ʱ�Զ�����false
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
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	public boolean isSuperManager() {
		return isSuperManager;
	}
	public void setSuperManager(boolean isSuperManager) {
		this.isSuperManager = isSuperManager;
	}
	@Override
	public String toString() {
		return "MangerUser [managerId=" + managerId + ", username=" + username
				+ ", password=" + password + ", managerName=" + managerName
				+ ", managerAge=" + managerAge + ", managerPho=" + managerPho
				+ ", managerIdNo=" + managerIdNo + ", managerNo=" + managerNo
				+ ", isManager=" + isManager + ", isSuperManager="
				+ isSuperManager + "]";
	}
	
	
}
