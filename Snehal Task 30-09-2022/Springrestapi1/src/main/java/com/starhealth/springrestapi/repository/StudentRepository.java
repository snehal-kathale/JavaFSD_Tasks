package com.starhealth.springrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.starhealth.springrestapi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	public Student findBySname(String sname);

	public List<Student> findBySalaryGreaterThan(double marks);

	@Query("select e from  student_from s where marks > ?1   order by sname desc")
	public List<Student> findBySortedMarks(double marks);

	@Query("select max(e.marks)  from student_from s")
	public Double findMaxMarks();

}
