package com.dp.beans;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties("org.nt")
public class Employee {
	
	private Integer eno;
	private String ename;
	private String eaddrs;
	private Double esalary;
}
