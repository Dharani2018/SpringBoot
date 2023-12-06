package com.dp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dp.model.Student;

@Component("dao")
public interface IStudentDao {
	
	public List<Student> fetchAllStudentDetailsByAddrs(String s1, String s2, String s3) throws Exception;

}
