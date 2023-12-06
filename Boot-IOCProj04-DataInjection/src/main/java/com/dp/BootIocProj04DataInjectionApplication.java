package com.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dp.beans.Customer;
import com.dp.beans.Hotel;

@SpringBootApplication
public class BootIocProj04DataInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj04DataInjectionApplication.class, args);
		Customer cust = ctx.getBean("customer", Customer.class);
		System.out.println(cust.toString());
		Hotel hotel = ctx.getBean("hotel", Hotel.class);
		
		System.out.println(hotel.toString());
	}

}
