//Vehicle.java
package com.dp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("vehicle")
public class Vehicle  {
	
	@Autowired
	@Qualifier("eng")
	//@Qualifier(@Value("${choose.engine}"))
	//@Value("${choose.engine}")
	private IEngine ee;
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}
	@PostConstruct
	public void begin() {
		System.out.println("vehicle is ready");
	}
	
	public String journey(String source, String dest) {
		
		System.out.println(ee.start());
		System.out.println("journey has started at......"+source);
		System.out.println("journey is going on...........");
		System.out.println(ee.stop());
		System.out.println("journey has stopped at ..."+dest);
		return "journey between"+source+" and "+dest+" has completed";
		
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Vehicle has stopped");
	}
	
	

	

}
