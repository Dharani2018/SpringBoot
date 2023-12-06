package com.dp.beans;

import lombok.Data;

@Data
//@Setter
//@Getter
public class Company {
	
	public Company() {
		System.out.println("Company.Company()");
	}
	

	private String name;
	private String addrs;
	private Integer size;
	private String director;
	

}
