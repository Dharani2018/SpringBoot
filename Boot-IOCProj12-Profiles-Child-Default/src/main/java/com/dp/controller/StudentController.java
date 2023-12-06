package com.dp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import com.dp.model.Student;
import com.dp.service.IStudentService;
@Controller("controller")
//@Profile("default")
public class StudentController {
	@Autowired
	private IStudentService service;
	
	public List<Student> getStudentList(String s1,String s2, String s3) throws Exception{
		List<Student> list = service.getStudentList( s1,  s2,  s3);
		return list;
		
	}

}
