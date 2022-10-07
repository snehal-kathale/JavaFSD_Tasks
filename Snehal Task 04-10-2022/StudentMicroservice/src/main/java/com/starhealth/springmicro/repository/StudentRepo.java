package com.starhealth.springmicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starhealth.springmicro.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
