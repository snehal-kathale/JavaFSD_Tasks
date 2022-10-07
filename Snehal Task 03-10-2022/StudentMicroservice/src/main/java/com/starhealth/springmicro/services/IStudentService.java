package com.starhealth.springmicro.services;

import com.starhealth.springmicro.entity.Student;
import com.starhealth.springmicro.vo.StudentDepartmentVo;

public interface IStudentService {
	
	public Student addStudent(Student stud);
	
	public Student getStudentById(Long studId);
	
	public StudentDepartmentVo getStudentAndDepartment(Long studId);

}
