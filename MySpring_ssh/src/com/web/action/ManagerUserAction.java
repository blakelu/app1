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
	private String vercode;//��֤��
	private String managername;//����Ա���� ����
	private String managerage;
	private String managerpho;//����Ա�ֻ��� ����
	private String manageridno;//����Ա���֤�� ����
	private String managerno;//����Ա֤���� �Զ����ɣ�������д�� ��ʽ ������+���֤����λ
	
	
	
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
	
	//���ᱻStruts2���л�ΪJSON�ַ����Ķ���  
    private Map<String, Object> dataMap;  

    private String responseText;   //service���صĽ��  
	private boolean flag;          //��Ҫ��Ϊ��Ч���ÿ���  
	
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

	
	//ҵ�񷽷�--��¼
	public String checkManagerUserLogin(){
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String)session.get("rand");
		System.out.println(vercode);
		if (vercode.equalsIgnoreCase(ver2) || vercode.equals(null)){
			//����md5+salt�㷨��salt����Ϊuser�ַ�����
        	String password = MD5.MD5Encode(user,pass);  
        	System.out.println(password);
        	boolean isLogin = managerUserService.login(user, password);
        	if(isLogin){
        		session.put("user" , user);
                log.info(user+"��¼�ɹ�");
                return SUCCESS;
        	} else{
                addFieldError("passError", "�û���/���벻ƥ��");
        		//addActionError("�û���/���벻ƥ��");
                log.info(user+"��¼ʧ��");
            	return INPUT;
            }
		}else{
			addFieldError("vercodeError", "��֤�벻ƥ��,����������");
			
			//addActionError("��֤�벻ƥ��,����������");
            log.info(user+"��¼ʧ��");
			return INPUT;
        }
	}

	// ע���û���֤
	public String regist() throws Exception {
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String) session.get("rand");
		session.put("rand", null);
		//System.out.println(pass);
		if(!pass.trim().equals(repass.trim())){
			addActionError("�������벻��ͬ����");
			return INPUT;
		}else if (managerUserService.validateName(user)) {
			addActionError("ϵͳ������" + user + "�û�����������ѡ��һ����");
			return INPUT;
		} else if (vercode.equalsIgnoreCase(ver2)) {
			// ����md5+salt�㷨��salt����Ϊuser�ַ�����
			String password = MD5.MD5Encode(user, pass);
			System.out.println(password);
			if (managerUserService.addUser(user, password, managername, managerage, managerpho, manageridno) > 0) {
				return SUCCESS;
			} else {
				addActionError("ע��ʧ�ܣ������ԣ�");
				return INPUT;
			}
		} else {
			addActionError("��֤�벻ƥ��,����������");
		}
		return INPUT;
	}
	
	//ajax�ж��û�������
	public String userExists() {
		try {
			dataMap= new HashMap<String, Object>();
			System.out.println(user);
			if (managerUserService.validateName(user)) {
				dataMap.put("flag", false);
				dataMap.put("responseText", "���û����Ѿ�����");
				System.out.println(1234);
				return SUCCESS;
			} else {
				dataMap.put("flag", true);
				dataMap.put("responseText", "����ע��");
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
