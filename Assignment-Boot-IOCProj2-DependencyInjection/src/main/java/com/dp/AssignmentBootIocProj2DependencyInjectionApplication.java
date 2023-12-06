package com.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.dp.beans.Student;

@SpringBootApplication
public class AssignmentBootIocProj2DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(AssignmentBootIocProj2DependencyInjectionApplication.class, args);
		Student s = ctx.getBean("student", Student.class);
		System.out.println(s.prepare("Dharani"));
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
