package com.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dp.beans.Employee;

@SpringBootApplication
public class BootIocProj06ConfigurationPropertiesOnArrayListSetHasApropertyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj06ConfigurationPropertiesOnArrayListSetHasApropertyApplication.class, args);
		Employee emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp.toString());
	}

}
