package com.dp.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties("org.nt")
public class Employee {
	
	private Integer eno;
	private String ename;
	private String[] nickNames;
	private List<String> friends;
	private Set<String> phoneNumbers;
	private Map<String,String> idDetails;
	
	private String exp;
	private String technology;
	
	private Company company;

}
