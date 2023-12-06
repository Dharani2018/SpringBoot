package com.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dp.beans.Employee;

@SpringBootApplication
public class BootIocProj08MoreOnYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj08MoreOnYmlApplication.class, args);
		Employee emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp);
	}

}
