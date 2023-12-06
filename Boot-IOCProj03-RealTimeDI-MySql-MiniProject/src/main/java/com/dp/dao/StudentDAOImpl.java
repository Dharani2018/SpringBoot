package com.dp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dp.model.Student;

@Component("dao")
public class StudentDAOImpl implements IStudentDAO {
	@Autowired
	private DataSource datasource;
	
	public static final String GET_ALL_STUDENT_DETAILS = "SELECT * FROM STUDENT WHERE SADD IN (?,?,?)";

	@Override
	public List<Student> getAllStudentDetailsByAddress(String city1, String city2, String city3) throws Exception {
		List list;
		try(Connection con = datasource.getConnection(); 
				PreparedStatement ps = con.prepareStatement(GET_ALL_STUDENT_DETAILS);){
			ps.setString(1, city1);
			ps.setString(2, city2);
			ps.setString(3, city3);
			
			try(ResultSet rs = ps.executeQuery()){
				list = new ArrayList<Student>();
				while(rs.next()) {
					Student student = new Student();
					student.setSno(rs.getInt(1));
					student.setSname(rs.getString(2));
					student.setAddress(rs.getString(3));
					student.setAvg(rs.getFloat(4));
					list.add(student);
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
