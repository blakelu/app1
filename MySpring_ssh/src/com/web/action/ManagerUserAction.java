package com.web.action;

import java.util.HashMap;
import java.util.Map;



import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.domain.ManagerUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.ManagerUserService;
import com.servlet.MD5;


public class ManagerUserAction extends ActionSupport implements ModelDriven<ManagerUser>{
	private ManagerUser managerUser = new ManagerUser();
	
	private String user;
	private String pass;
	private String repass;
	private String vercode;//验证码
	private String managername;//管理员姓名 必填
	private String managerage;
	private String managerpho;//管理员手机号 必填
	private String manageridno;//管理员身份证号 必填
	private String managerno;//管理员证件号 自动生成（无需填写） 格式 年月日+身份证后六位
	
	
	
	Log log = LogFactory.getLog(ManagerUserAction.class);
	@Override
	public ManagerUser getModel() {
		// TODO Auto-generated method stub
		return managerUser;
	}
	
	private ManagerUserService managerUserService;

	public void setManagerUserService(ManagerUserService managerUserService) {
		this.managerUserService = managerUserService;
	}
	
	//将会被Struts2序列化为JSON字符串的对象  
    private Map<String, Object> dataMap;  

    private String responseText;   //service返回的结果  
	private boolean flag;          //主要是为了效果好看点  
	
	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	
	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	
	//业务方法--登录
	public String checkManagerUserLogin(){
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String)session.get("rand");
		System.out.println(vercode);
		if (vercode.equalsIgnoreCase(ver2) || vercode.equals(null)){
			//采用md5+salt算法，salt算子为user字符串。
        	String password = MD5.MD5Encode(user,pass);  
        	System.out.println(password);
        	boolean isLogin = managerUserService.login(user, password);
        	if(isLogin){
        		session.put("user" , user);
                log.info(user+"登录成功");
                return SUCCESS;
        	} else{
                addFieldError("passError", "用户名/密码不匹配");
        		//addActionError("用户名/密码不匹配");
                log.info(user+"登录失败");
            	return INPUT;
            }
		}else{
			addFieldError("vercodeError", "验证码不匹配,请重新输入");
			
			//addActionError("验证码不匹配,请重新输入");
            log.info(user+"登录失败");
			return INPUT;
        }
	}

	// 注册用户验证
	public String regist() throws Exception {
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String) session.get("rand");
		session.put("rand", null);
		//System.out.println(pass);
		if(!pass.trim().equals(repass.trim())){
			addActionError("两次密码不相同！！");
			return INPUT;
		}else if (managerUserService.validateName(user)) {
			addActionError("系统中已有" + user + "用户名，请重新选择一个！");
			return INPUT;
		} else if (vercode.equalsIgnoreCase(ver2)) {
			// 采用md5+salt算法，salt算子为user字符串。
			String password = MD5.MD5Encode(user, pass);
			System.out.println(password);
			if (managerUserService.addUser(user, password, managername, managerage, managerpho, manageridno) > 0) {
				return SUCCESS;
			} else {
				addActionError("注册失败，请重试！");
				return INPUT;
			}
		} else {
			addActionError("验证码不匹配,请重新输入");
		}
		return INPUT;
	}
	
	//ajax判断用户名存在
	public String userExists() {
		try {
			dataMap= new HashMap<String, Object>();
			System.out.println(user);
			if (managerUserService.validateName(user)) {
				dataMap.put("flag", false);
				dataMap.put("responseText", "该用户名已经存在");
				System.out.println(1234);
				return SUCCESS;
			} else {
				dataMap.put("flag", true);
				dataMap.put("responseText", "可以注册");
				return SUCCESS;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	


	public ManagerUser getManagerUser() {
		return managerUser;
	}

	public void setManagerUser(ManagerUser managerUser) {
		this.managerUser = managerUser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRepass() {
		return repass;
	}

	public void setRepass(String repass) {
		this.repass = repass;
	}

	public String getVercode() {
		return vercode;
	}

	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	public String getManagername() {
		return managername;
	}

	public void setManagername(String managername) {
		this.managername = managername;
	}

	public String getManagerage() {
		return managerage;
	}

	public void setManagerage(String managerage) {
		this.managerage = managerage;
	}

	public String getManagerpho() {
		return managerpho;
	}

	public void setManagerpho(String managerpho) {
		this.managerpho = managerpho;
	}

	public String getManageridno() {
		return manageridno;
	}

	public void setManageridno(String manageridno) {
		this.manageridno = manageridno;
	}

	public String getManagerno() {
		return managerno;
	}

	public void setManagerno(String managerno) {
		this.managerno = managerno;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public ManagerUserService getManagerUserService() {
		return managerUserService;
	}

	
	
}
