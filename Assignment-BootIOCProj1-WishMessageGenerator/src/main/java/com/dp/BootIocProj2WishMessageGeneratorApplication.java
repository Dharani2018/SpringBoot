package com.dp;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.dp.beans.WishMessageGenerator;

@SpringBootApplication
public class BootIocProj2WishMessageGeneratorApplication {
	
	@Bean(name = "ldt")
	public LocalDateTime createLdt() {
		System.out.println("BootIocProj2WishMessageGeneratorApplication.createLdt()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj2WishMessageGeneratorApplication.class, args);
		
		  WishMessageGenerator gm = ctx.getBean("wmg", WishMessageGenerator.class);
		  System.out.println("msg:: "+gm.generateMessage("Dharani"));
		  
		  //close the container
		 ((ConfigurableApplicationContext)ctx).close();
	}

}
