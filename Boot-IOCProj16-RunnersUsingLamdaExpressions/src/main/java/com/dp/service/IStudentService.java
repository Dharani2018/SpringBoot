package com.dp.service;

import java.util.List;

import com.dp.model.Student;

public interface IStudentService {
	
	public List<Student> fetchAllStudentDetails(String city1, String city2, String city3) throws Exception;

}
