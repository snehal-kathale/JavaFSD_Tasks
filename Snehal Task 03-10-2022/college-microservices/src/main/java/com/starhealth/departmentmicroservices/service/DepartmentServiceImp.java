package com.starhealth.departmentmicroservices.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.departmentmicroservices.entity.Department;
import com.starhealth.departmentmicroservices.repository.DepartmentRepository;
@Service
public class DepartmentServiceImp implements IDepartmentService {

	@Autowired
	DepartmentRepository repo;
	
	@Override
	public Department addDepartment(Department dept) {
		// TODO Auto-generated method stub
		return repo.save(dept);
	}

	@Override
	public Department getDeptById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(new Department());
	}

}

