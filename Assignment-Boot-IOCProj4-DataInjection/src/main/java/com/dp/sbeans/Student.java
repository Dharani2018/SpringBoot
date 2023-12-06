package com.dp.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component("student")
public class Student {
	
	/*
	 * @Autowired private Marks marks;
	 */
	
	@Value("01")
	private Integer sno;
	@Value("${stud.name}")
	private String sname;
	@Value("${stud.inst}")
	private String inst;
	@Value("${stud.addrs}")
	private String saddrs;
	
	
	  @Value("#{marks.math+marks.eng+marks.social}")
	  private Float totalMarks;
	  
	  @Value("#{(marks.math+marks.eng+marks.social)/3}")
	  private Float avgMarks;
	 
	
	
	public Student() {
		System.out.println("Student.Student()");
	}
	

}
