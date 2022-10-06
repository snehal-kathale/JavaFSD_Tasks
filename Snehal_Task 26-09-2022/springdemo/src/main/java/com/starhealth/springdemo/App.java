package com.starhealth.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		 BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));
		
		
		Address a1 =		factory.getBean("a1",Address.class);
		
		System.out.println(a1);
		
		
		
		
		
		Student e1 = factory.getBean("stu1", Student.class);
		
		System.out.println(e1);
		
		System.out.println(e1.getAddress());
		
		System.out.println(e1.getSkills());
		
	
		

		
	}
}
