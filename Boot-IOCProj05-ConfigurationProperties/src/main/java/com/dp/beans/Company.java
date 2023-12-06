package com.dp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("company")
@ConfigurationProperties("org.nit")
@Setter
@ToString
public class Company {
	
	private String name;
	private String addrs;
	private Long pincode;
	private Long contact;
	
	//@Value("${comp.size}")
	private Long size;
	
	@Value("${comp.mainBranch}")
	private String headOffice;
	
	
}
