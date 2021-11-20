package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author "Jyothi"
 * @version "1.0"
 *
 */

@Entity
@Table(name="User1")
public class User {
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int usr_id;
	@Column
	private String usr_name;
	@Column
	private String usr_email;
	@Column
	private String usr_address;
	@Column
	private String usr_password;
	@Column
	private int usr_mobile;
	@Column
	private String usr_gender;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int usr_id, String usr_name, String usr_email, String usr_address, String usr_password,
			int usr_mobile, String usr_gender) {
		super();
		this.usr_id = usr_id;
		this.usr_name = usr_name;
		this.usr_email = usr_email;
		this.usr_address = usr_address;
		this.usr_password = usr_password;
		this.usr_mobile = usr_mobile;
		this.usr_gender = usr_gender;
	}





	public int getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(int usr_id) {
		this.usr_id = usr_id;
	}
	/**
	 * 
	 * @return String
	 */

	public String getUsr_name() {
		return usr_name;
	}
	/**
	 * 
	 * @param usr_name
	 */

	public void setUsr_name(String usr_name) {
		this.usr_name = usr_name;
	}

	public String getUsr_address() {
		return usr_address;
	}

	public void setUsr_address(String usr_address) {
		this.usr_address = usr_address;
	}

	public int getUsr_mobile() {
		return usr_mobile;
	}

	public void setUsr_mobile(int usr_mobile) {
		this.usr_mobile = usr_mobile;
	}
	
	

	public String getUsr_gender() {
		return usr_gender;
	}



	public void setUsr_gender(String usr_gender) {
		this.usr_gender = usr_gender;
	}



	public String getUsr_email() {
		return usr_email;
	}



	public void setUsr_email(String usr_email) {
		this.usr_email = usr_email;
	}

	


	public String getUsr_password() {
		return usr_password;
	}





	public void setUsr_password(String usr_password) {
		this.usr_password = usr_password;
	}





	@Override
	public String toString() {
		return "User [usr_id=" + usr_id + ", usr_name=" + usr_name + ", usr_email=" + usr_email
				+ ", usr_address=" + usr_address + ", usr_password=" + usr_password + ", usr_mobile=" + usr_mobile
				+ ", usr_gender=" + usr_gender + "]";
	}




}
