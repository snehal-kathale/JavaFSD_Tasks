package com.starhealth.ems.bean;

import java.sql.Date;

public class Sports { // Bean , Entity , Pojo , Model , DTO , VO
	
	
	private  int sid;
	private String sname;
	private double svalue;
	private  String type;

	
	
	public Sports() {
		
		
	}


	public Sports(int sid, String sname, double svalue, String type) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.svalue = svalue;
		this.type = type;
		
	}


	public int getsid() {
		return sid;
	}


	public void setsid(int sid) {
		this.sid = sid;
	}


	public String getsname() {
		return sname;
	}


	public void setsname(String sname) {
		this.sname = sname;
	}


	public double getsvalue() {
		return svalue;
	}


	public void setsvalue(double svalue) {
		this.svalue = svalue;
	}


	public String gettype() {
		return type;
	}


	public void settype(String type) {
		this.type = type;
	}


	

	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", sname=" + sname + ", svalue=" + svalue + ", type=" + type +"]";
	}
	
	
	
	

}
