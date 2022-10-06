package com.starhealth.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.starhealth.springannotations.beans.Address;
import com.starhealth.springannotations.beans.Employee;
import com.starhealth.springannotations.beans.Student;
import com.starhealth.springannotations.controller.HelloController;
import com.starhealth.springannotations.dao.EmployeeRepositoryImp;
import com.starhealth.springannotations.dao.IEmployeeRepository;
import com.starhealth.springannotations.service.EmployeeService;
import com.starhealth.springannotations.service.IEmployeeService;

@Configuration
@ComponentScan(basePackages = { "com.starhealth.springannotations.*" })
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		
		Employee emp = context.getBean("emp1", Employee.class);

		System.out.println(emp);

		Employee e2 = context.getBean("emp1", Employee.class);

		
	   System.out.println(e2);

		emp.setEid(101);
		emp.setEname("Sneha");
		emp.setSalary(50000);

		//emp.setAddress(a1);
		
		System.out.println(emp.getEid() + " " + emp.getEname() + "  " + emp.getSalary());

		System.out.println(emp.getAddress());
		
		IEmployeeService service = context.getBean(EmployeeService.class);

		System.out.println(service);
		
		service.callService();

		IEmployeeRepository repo = context.getBean("repo", EmployeeRepositoryImp.class);

		System.out.println(repo);

		repo.getRepo();

		HelloController hc = context.getBean(HelloController.class);

		System.out.println(hc);

		Student s1 = context.getBean("s1", Student.class);

		System.out.println(s1);
		
				

	}

	@Bean("s1")
	public Student getStudent() {

		return new Student();

	}
	
	@Bean("emp3")
	public Employee  getEmployee() {
		
		return new Employee(111, "Snehal", 70000);
		
	}
	
		
	

}
