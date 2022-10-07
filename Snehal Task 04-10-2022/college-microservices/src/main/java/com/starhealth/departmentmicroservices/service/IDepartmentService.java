package com.starhealth.departmentmicroservices.service;

import com.starhealth.departmentmicroservices.entity.Department;

public interface IDepartmentService {
	
	public   Department       addDepartment(Department dept);
	
	public  Department  getDeptById(Long id);
	
	

}
