package com.dp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dp.model.Student;
import com.dp.service.StudentServiceImpl;
@Component("controller")
public class StudentController {
	@Autowired
	private StudentServiceImpl service;
	List<Student> list;
	
	public List<Student> processStudentData(String city1, String city2, String city3) throws Exception{
		list = service.fetchAllStudentDetails(city1, city2, city3);
		return list;
	}

}
