package com.starhealth.springrestapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starhealth.springrestapi.entity.Student;
import com.starhealth.springrestapi.service.IStudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentRestController {

	@Autowired
	IStudentService service;

	// @RequestMapping(value="/add",method= RequestMethod.POST)
	@PostMapping("/add")
	public Student add(@RequestBody Student stu) {

		return service.addStudent(stu);

	}

	@PutMapping("/update")
	public Student update(@RequestBody Student stu) {

		return service.updateStudent(stu);

	}

	@DeleteMapping("/delete/{id}") // http://localhost:8080/api/v1/students/delete/101
	public String delete(@PathVariable int id) {

		service.deleteStudentById(id);

		return "Recored Deleted Successfully";

	}

	@GetMapping("/get/{id}")
	public Student getById(@PathVariable int id) { // http://localhost:8080/api/v1/students/get/101

		return service.selectStudentById(id);

	}

	@GetMapping("/getall")
	public List<Student> getAll() { // http://localhost:8080/api/v1/students/getall

		return service.selectAllStudents();

	}

	@GetMapping("/getbyename/{sname}")
	public Student selectBySName(@PathVariable String sname) {

		return service.selectBySName(sname);

	}

	@GetMapping("/get/salarygt/{marks}")
	public List<Student> selectBySalaryGT(@PathVariable double marks){
		
		
		return  service.selectByMarksGT(marks);
		
	}
	
	
	@GetMapping("/get/sortedsalary/{marks}")
	public List<Student>  getSortedSalary(@PathVariable double marks){
		
		
		return service.selectSortedMarks(marks);
		
		
	}
	
		

}