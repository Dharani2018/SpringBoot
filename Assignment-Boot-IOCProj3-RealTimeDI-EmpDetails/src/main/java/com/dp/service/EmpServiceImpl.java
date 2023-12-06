package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dp.dao.IEmpDao;
import com.dp.model.Emp;

@Service("empService")
public class EmpServiceImpl implements IEmpService {
	
	@Autowired
	@Qualifier("finalDao")
	public IEmpDao dao;

	@Override
	public List<Emp> fetchEmpDetails(String desg1, String desg2, String desg3) throws Exception {
		List<Emp> empList = dao.getAllEmpDetailsByDesg(desg1, desg2, desg3);
		empList.forEach(emp->emp.setResult(emp.getEmpName()+" earning "+emp.getSal()+" per month from "+emp.getEmpAddrs()));
		return empList;
	}

	

}
