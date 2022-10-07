package com.starhealth.springmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starhealth.springmicro.entity.Student;
import com.starhealth.springmicro.services.IStudentService;
import com.starhealth.springmicro.vo.StudentDepartmentVo;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	IStudentService service;
	
	@PostMapping("/add")
	public Student addNewStudent(@RequestBody Student stud) {
		return service.addStudent(stud);
	}
	
	@GetMapping("/get/{studId}")
	public Student getStudentById(@PathVariable Long studId) {
		return service.getStudentById(studId);
	}

	@GetMapping("/get/stud-department/{studId}")
	public StudentDepartmentVo getStudentAndDepartment(@PathVariable Long studId) {
	
		return service.getStudentAndDepartment(studId);
	}
}
