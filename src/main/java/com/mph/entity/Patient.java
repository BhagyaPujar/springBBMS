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
@Table(name="Patient")
public class Patient {
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pat_id;
	@Column
	private String pat_name;
	@Column
	private String pat_email;
	@Column
	private String pat_address;
	@Column
	private String pat_password;
	@Column
	private int pat_mobile;
	@Column
	private String pat_gender;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int pat_id, String pat_name, String pat_email, String pat_address, String pat_password,
			int pat_mobile, String pat_gender) {
		super();
		this.pat_id = pat_id;
		this.pat_name = pat_name;
		this.pat_email = pat_email;
		this.pat_address = pat_address;
		this.pat_password = pat_password;
		this.pat_mobile = pat_mobile;
		this.pat_gender = pat_gender;
	}
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	/**
	 * 
	 * @return String
	 */
	public String getPat_name() {
		return pat_name;
	}
	/**
	 * 
	 * @param pat_name
	 */
	public void setPat_name(String pat_name) {
		this.pat_name = pat_name;
	}
	
	public String getPat_email() {
		return pat_email;
	}
	public void setPat_email(String pat_email) {
		this.pat_email = pat_email;
	}
	public String getPat_address() {
		return pat_address;
	}
	public void setPat_address(String pat_address) {
		this.pat_address = pat_address;
	}
	public String getPat_password() {
		return pat_password;
	}
	public void setPat_password(String pat_password) {
		this.pat_password = pat_password;
	}
	public int getPat_mobile() {
		return pat_mobile;
	}
	public void setPat_mobile(int pat_mobile) {
		this.pat_mobile = pat_mobile;
	}
	public String getPat_gender() {
		return pat_gender;
	}
	public void setPat_gender(String pat_gender) {
		this.pat_gender = pat_gender;
	}
	@Override
	public String toString() {
		return "Patient [pat_id=" + pat_id + ", pat_name=" + pat_name + ", pat_email=" + pat_email + ", pat_address="
				+ pat_address + ", pat_password=" + pat_password + ", pat_mobile=" + pat_mobile + ", pat_gender="
				+ pat_gender + "]";
	}
	
}