package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author "Jyothi"
 * @version "1.0"
 */


@Entity
 public class Hospital {
		/**
		 * 
		 */
 
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private int hospid;
	    private int phone;
	    private String email;
	    private String name;
		private String address;
		
		public Hospital() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Hospital(int hospid, int phone, String email, String name, String address) {
			super();
			this.hospid = hospid;
			this.name = name;
			this.phone = phone;
			this.email = email;
			this.address = address;
		}

		public int getHospid() {
			return hospid;
		}

		public void setHospid(int hospid) {
			this.hospid = hospid;
		}
		/**
		 * 
		 * @return String
		 */
		public String getName() {
			return name;
		}
		/**
		 * 
		 * @param name
		 */
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Hospital [hospid=" + hospid + ", phone=" + phone + ", email=" + email + ", name=" + name
					+ ", address=" + address + "]";
		}
	
			
}
       

