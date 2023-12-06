package com.dp.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("marks")
public class Marks {
	
	@Value("${maks.math}")
	private Integer math;
	@Value("${maks.eng}")
	private Integer eng;
	@Value("${maks.social}")
	private Integer social;
	
	
	
	

	public Marks() {
		System.out.println("Marks.Marks()");
	}
}
