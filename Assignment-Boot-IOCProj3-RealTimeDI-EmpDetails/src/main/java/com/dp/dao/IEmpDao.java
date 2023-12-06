package com.dp.dao;

import java.util.List;

import com.dp.model.Emp;

public interface IEmpDao{
	
	public List<Emp> getAllEmpDetailsByDesg(String desg1, String desg2, String desg3) throws Exception;

}
