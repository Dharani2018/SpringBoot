package com.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dp.sbeans.Student;

@SpringBootApplication
public class AssignmentBootIocProj4DataInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(AssignmentBootIocProj4DataInjectionApplication.class, args);
		Student s= ctx.getBean("student", Student.class);
		System.out.println(s.toString());
	}

}
