package com.dp.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@ConfigurationProperties("org.nt")
@Data
public class Employee {
	
	private Integer eno;
	private String ename;
	private String[] friends;
	private List<String> nickNames;
	private Set<String> phoneNumbers;
	private Map<String, String> idDetails;
	
	private Company company;	

}
