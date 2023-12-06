package com.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.dp.beans.Company;

@SpringBootApplication
@PropertySource("Info.properties")
public class BootIocProj05ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj05ConfigurationPropertiesApplication.class, args);
		Company cp = ctx.getBean("company", Company.class);
		System.out.println(cp.toString());
		
		
	}

}
