package com.starhealth.springrestapi.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="StudentDetails")
public class Student {            // here StudentDetails table will be auto generated..
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;  // now sid will be consider as primary key in DB
	@Column(name="stu_name")
	private String sname;
	private double marks;
	
	

}