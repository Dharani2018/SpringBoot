package com.dp.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime ldt;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	public String generateMessage(String str) {
		int hour = ldt.getHour();
		if(hour<=12) {
			return "good morning "+str;
		}else if (hour<=16) {
			return "good afternoon "+str;
		}else if(hour <= 20) {
			return "good evening "+str;
		}else {
			return "good night "+str;
		}
	}
	

}
