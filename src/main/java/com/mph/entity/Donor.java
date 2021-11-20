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
	@Table(name="DonateBlood")
	public class Donor {
		/**
		 * 
		 */
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int dnr_id;
		@Column
		private String dnr_name;
		@Column
		private String dnr_email;
		@Column
		private String dnr_address;
		@Column
		private String dnr_password;
		@Column
		private int dnr_mobile;
		@Column
		private String dnr_gender;
		@Column
		private String dnr_bldgrp;
		public Donor() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Donor(int dnr_id, String dnr_name, String dnr_email, String dnr_address, String dnr_password,
				int dnr_mobile, String dnr_gender, String dnr_bldgrp) {
			super();
			this.dnr_id = dnr_id;
			this.dnr_name = dnr_name;
			this.dnr_email = dnr_email;
			this.dnr_address = dnr_address;
			this.dnr_password = dnr_password;
			this.dnr_mobile = dnr_mobile;
			this.dnr_gender = dnr_gender;
			this.dnr_bldgrp = dnr_bldgrp;
		}
		public int getDnr_id() {
			return dnr_id;
		}
		public void setDnr_id(int dnr_id) {
			this.dnr_id = dnr_id;
		}
		/**
		 * 
		 * @return String
		 */
		public String getDnr_name() {
			return dnr_name;
		}
		/**
		 * 
		 * @param dnr_name
		 */
		public void setDnr_name(String dnr_name) {
			this.dnr_name = dnr_name;
		}
		
		public String getDnr_email() {
			return dnr_email;
		}
		public void setDnr_email(String dnr_email) {
			this.dnr_email = dnr_email;
		}
		public String getDnr_address() {
			return dnr_address;
		}
		public void setDnr_address(String dnr_address) {
			this.dnr_address = dnr_address;
		}
		public String getDnr_password() {
			return dnr_password;
		}
		public void setDnr_password(String dnr_password) {
			this.dnr_password = dnr_password;
		}
		public int getDnr_mobile() {
			return dnr_mobile;
		}
		public void setDnr_mobile(int dnr_mobile) {
			this.dnr_mobile = dnr_mobile;
		}
		public String getDnr_gender() {
			return dnr_gender;
		}
		public void setDnr_gender(String dnr_gender) {
			this.dnr_gender = dnr_gender;
		}
		public String getDnr_bldgrp() {
			return dnr_bldgrp;
		}
		public void setDnr_bldgrp(String dnr_bldgrp) {
			this.dnr_bldgrp = dnr_bldgrp;
		}
		@Override
		public String toString() {
			return "Donor [dnr_id=" + dnr_id + ", dnr_name=" + dnr_name + ", dnr_email=" + dnr_email + ", dnr_address="
					+ dnr_address + ", dnr_password=" + dnr_password + ", dnr_mobile=" + dnr_mobile + ", dnr_gender="
					+ dnr_gender + ", dnr_bldgrp=" + dnr_bldgrp + "]";
		}
		
}