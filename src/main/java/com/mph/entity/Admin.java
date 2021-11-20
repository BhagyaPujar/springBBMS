package com.mph.entity; 


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;  
/**
 * @author "Jyothi"
 * @version "1.0"
 */
@Entity
@Table(name="Admin1")
public class Admin {
	/**
	 * 
	 */

	@Id
	private String emailId;
	private String password;
	
	private String adminName;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Admin(String emailId, String password, String adminName) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.adminName =adminName;
	}


	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @return String
	 */
	
	public String getAdminName() {
		return adminName;
	}
	/**
	 * @param adminname
	 */

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
		
	public String toString() {
		return "Admin [emailId=" + emailId + ", password=" + password + ", adminName=" + adminName + "]";
	}

	
}

