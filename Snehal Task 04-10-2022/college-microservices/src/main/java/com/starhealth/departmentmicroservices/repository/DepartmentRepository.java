package com.starhealth.departmentmicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starhealth.departmentmicroservices.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
