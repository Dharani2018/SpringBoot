package com.dp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dp.model.Emp;
import com.dp.service.IEmpService;

@Controller("empController")
public class EmpController {
	@Autowired
	public IEmpService service;
	
	public List<Emp> getEmployeeDetails(String desg1, String desg2, String desg3) throws Exception{
		List<Emp> empList = service.fetchEmpDetails(desg1, desg2, desg3);
		return empList;
	}
}
