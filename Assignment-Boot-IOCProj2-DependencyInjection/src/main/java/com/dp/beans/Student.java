//Student.java
package com.dp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("student")
public class Student {
	@Autowired
	//@Qualifier("java")
	private ICourseMaterial dotNet;
	
	public Student() {
		System.out.println("Student.Student()");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("sending message.......");
	}
	public String prepare(String cName) {
		return "Hi "+cName+" "+dotNet.registeredCourse()+" "+dotNet.coursFee();
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("message has sent..........");
	}
	
}
