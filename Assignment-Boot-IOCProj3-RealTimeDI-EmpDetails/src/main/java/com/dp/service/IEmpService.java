package com.dp.service;

import java.util.List;

import com.dp.model.Emp;

public interface IEmpService {
	public List<Emp> fetchEmpDetails(String desg1, String Desg2, String Desg3) throws Exception;
}
