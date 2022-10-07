package com.starhealth.springmicro.vo;

import com.starhealth.springmicro.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDepartmentVo {

	private Student student;
	private Department dept;
}
