package com.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.dp.beans.Vehicle;

@SpringBootApplication
@ImportResource("com/dp/cfgs/applicationContext.xml")
public class BootIocProj2DependencyInjectionApplication {

	public static void main(String[] args) {
		
		
		 ApplicationContext ctx=SpringApplication.run(BootIocProj2DependencyInjectionApplication.class, args);
		 Vehicle v = ctx.getBean("vehicle", Vehicle.class);
		 System.out.println(v.journey("Nalgonda", "Goa"));
	}

}
