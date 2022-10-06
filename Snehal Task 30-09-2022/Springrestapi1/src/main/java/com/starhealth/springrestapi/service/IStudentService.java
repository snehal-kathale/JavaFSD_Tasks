package com.starhealth.springrestapi.service;

import java.util.List;

import com.starhealth.springrestapi.entity.Student;

public interface IStudentService {
	
	public Student  addStudent(Student stu);
	public Student  updateStudent(Student stu);
	
	public Student selectStudentById(int id);
	public void    deleteStudentById(int id);
	
	
	public List<Student>  selectAllStudents();
	
	public Student selectBySName(String sname);
	
	public List<Student>  selectByMarksGT(double marks);
	
	public List<Student>  selectSortedMarks(double marks);

}