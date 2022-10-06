package com.starhealth.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.starhealth.springrestapi.repository.StudentRepository;

@SpringBootApplication(scanBasePackages = {"com.starhealth.springrestapi"})
//@EnableJpaRepositories(basePackageClasses = StudentRepository.class)

public class Springrestapi1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springrestapi1Application.class, args);
	}

}
