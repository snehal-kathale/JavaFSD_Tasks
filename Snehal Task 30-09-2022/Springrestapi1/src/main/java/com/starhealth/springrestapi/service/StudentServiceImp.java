package com.starhealth.springrestapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.starhealth.springrestapi.entity.Student;
import com.starhealth.springrestapi.repository.StudentRepository;

@Service
public class StudentServiceImp implements IStudentService {

	
	StudentRepository repo;

	@Override
	
	public Student addStudent(Student stu) {

		return repo.save(stu);
	}

	@Override
	public Student updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return repo.save(stu);
	}

	@Override
	public Student selectStudentById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(new Student());
	}

	@Override
	public void deleteStudentById(int id) {

		repo.deleteById(id);

	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student selectBySName(String sname) {
		// TODO Auto-generated method stub
		return repo.findBySname(sname);
	}

	@Override
	public List<Student> selectByMarksGT(double marks) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(marks);
	}

	@Override
	public List<Student> selectSortedMarks(double marks) {
		// TODO Auto-generated method stub
		return repo.findBySortedMarks(marks);
	}

}