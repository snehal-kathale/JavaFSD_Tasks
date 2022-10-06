package com.starhealth.springdemo;

import java.util.List;

public class Student { // POJO , BEAN
	
	private int sid;
	private String sname;  // properties
	private double marks;
	private  Address  address;  //HAS A RELATIONSHIP
	private List<String> skills;
	
	
	public Student() {
		
		System.out.println("Student() object created...");
		
	}
	
	
	public Student(int sid, String sname, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		
		System.out.println("Student(sid,sname,mark) obj created..");
	}
	
	
	
	
	
	public List<String> getSkills() {
		return skills;
	}


	public void setSkills(List<String> skills) {
		this.skills = skills;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getsid() {
		return sid;
	}
	public void setsid(int sid) {
		this.sid = sid;
		
		System.out.println("Setter methods called");
		
	}
	public String getsname() {
		return sname;
	}
	public void setsname(String sname) {
		this.sname = sname;
	}
	public double getmarks() {
		return marks;
	}
	public void setmarks(double marks) {
		this.marks = marks;
	}
	
	
	
	
	

}
