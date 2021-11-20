package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 
 * @author "Jyothi"
 * @version "1.0"
 */

@Entity
public class Blood {
	/**
	 * 
	 */
	@Id
	private int  bld_id;
	private int bld_units;
	private int stk_id;
	private int stk_num;
	private String bld_group;
	public Blood() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Blood(int bld_id, int bld_units, int stk_id, int stk_num, String bld_group) {
		super();
		this.bld_id = bld_id;
		this.bld_units = bld_units;
		this.stk_id = stk_id;
		this.stk_num = stk_num;
		this.bld_group = bld_group;
	}




	public int getBld_id() {
		return bld_id;
	}
	public void setBld_id(int bld_id) {
		this.bld_id = bld_id;
	}
	/**
	 * 
	 * @return String
	 */
	
	
	public int getBld_units() {
		return bld_units;
	}
	public void setBld_units(int bld_units) {
		this.bld_units = bld_units;
	}
	public int getStk_id() {
		return stk_id;
	}
	public void setStk_id(int stk_id) {
		this.stk_id = stk_id;
	}
	public int getStk_num() {
		return stk_num;
	}
	public void setStk_num(int stk_num) {
		this.stk_num = stk_num;
	}
	public String getBld_group() {
		return bld_group;
	}
	public void setBld_group(String bld_group) {
		this.bld_group = bld_group;
	}


	@Override
	public String toString() {
		return "Blood [bld_id=" + bld_id + ", bld_units=" + bld_units + ", stk_id=" + stk_id + ", stk_num=" + stk_num
				+ ", bld_group=" + bld_group + "]";
	}
	
	
	
}