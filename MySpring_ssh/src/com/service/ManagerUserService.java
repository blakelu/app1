package com.service;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.aspectj.weaver.ast.Var;

import com.dao.ManagerUserDAO;
import com.domain.ManagerUser;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class ManagerUserService {
	private ManagerUserDAO managerUserDAO;

	public void setManagerUserDAO(ManagerUserDAO managerUserDAO) {
		this.managerUserDAO = managerUserDAO;
	}
	
	//用户登录验证
	public boolean login(String username,String password){
		List<ManagerUser> managerUsers = 
				managerUserDAO.findByNamedQuery("ManagerUser.verify", username, password);
		for(int i = 0; i < managerUsers.size(); i++){
			ManagerUser managerUser = managerUsers.get(i);
			if(managerUser != null && !managerUser.getUsername().trim().equals("")){
				return true;
			}
		}
		return false;
	}
	
	//判断用户名是否存在
	public boolean validateName(String username) throws Exception {
		// TODO Auto-generated method stub
		try {
			List<ManagerUser> managerUsers = 
					managerUserDAO.findByNamedQuery("ManagerUser.validateName", username);
			for(int i = 0; i < managerUsers.size(); i++){
				ManagerUser managerUser = managerUsers.get(i);
				if(managerUser != null && !managerUser.getUsername().trim().equals("")){
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			throw new Exception("验证用户名是否有效出错");
		}
	}
	
	//添加用户或注册用户
	public int addUser(String user, String pass, String name ,String age ,String pho,String idno) throws Exception {
		// TODO Auto-generated method stub
		try{
			ManagerUser u = new ManagerUser();
			u.setUsername(user);
			u.setPassword(pass);
			u.setManagerName(name);
			u.setManagerAge(age);
			u.setManagerPho(pho);
			u.setManagerIdNo(idno);
			//管理员证件号 自动生成（无需填写） 格式 年月日+身份证后4位
			Date d = new Date();  
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
	        String dateNowStr = sdf.format(d);  
			int n=6;
			String managerNo = dateNowStr + idno.substring(idno.length()-n,idno.length());
			u.setManagerNo(managerNo);			
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateNowStr1 = sdf1.format(d);  
			u.setRegistDate(dateNowStr1);			
			u.setIsManager(true);
			u.setIsSuperManager(false);
			managerUserDAO.save(u);

			return 1;
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("新增用户异常");
		}
	}
	
	public static void main(String[] args){
		String idno = new String("310114199310071013");
		Date d = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
        String dateNowStr = sdf.format(d);  
		int n=4;
		String managerNo=dateNowStr + idno.trim().substring(idno.length()-n,idno.length());
		System.out.println(managerNo);
	}
	
}
