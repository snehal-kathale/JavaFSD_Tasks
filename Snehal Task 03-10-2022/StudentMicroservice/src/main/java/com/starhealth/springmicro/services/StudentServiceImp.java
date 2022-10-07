package com.starhealth.springmicro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.starhealth.springmicro.entity.Student;
import com.starhealth.springmicro.repository.StudentRepo;
import com.starhealth.springmicro.vo.StudentDepartmentVo;
import com.starhealth.springmicro.vo.Department;


@Service
public class StudentServiceImp implements IStudentService{

	@Autowired
	RestTemplate restTemplate;

	
	@Autowired
	StudentRepo repo;
	
	@Override
	public Student addStudent(Student stud) {
		// TODO Auto-generated method stub
		return repo.save(stud);
	}

	@Override
	public Student getStudentById(Long studId) {
		// TODO Auto-generated method stub
		return repo.findById(studId).orElse(new Student());
	}

	@Override
	public StudentDepartmentVo getStudentAndDepartment(Long studId) {
		// TODO Auto-generated method stub
		Student student = getStudentById(studId);
		
		Long departmentId =  student.getDepartmentId();
		
		Department department  =	restTemplate.getForObject("http://localhost:8282/api/department/get/"+ departmentId, Department.class);	
		
		//Department department = (Department)	response.getBody();
	
		StudentDepartmentVo  studDepartment = new StudentDepartmentVo(student, department);
		
		return studDepartment;
	}

}
