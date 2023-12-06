package com.dp.dao;

import java.util.List;

import com.dp.model.Student;

public interface IStudentDAO {
	
	public List<Student> getAllStudentDetailsByAddress(String city1, String city2, String city3) throws Exception;

}
