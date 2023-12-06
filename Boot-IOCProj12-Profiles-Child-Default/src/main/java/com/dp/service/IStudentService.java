package com.dp.service;

import java.util.List;

import com.dp.model.Student;

public interface IStudentService {
	
	public List<Student> getStudentList(String s1, String s2, String s3) throws Exception;

}
