package com.dp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dp.model.Student;
@Repository("mysql")
@Profile({"dev","test"})
public class MysqlDaoImpl implements IStudentDao {
	
	@Autowired
	private DataSource ds;

	private static final String query = "SELECT * FROM STUDENT WHERE SADD IN (?,?,?)";
	@Override
	public List<Student> fetchAllStudentDetailsByAddrs(String s1, String s2, String s3) throws Exception {
		List<Student> list ;
		try(Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)){
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			pstmt.setString(3, s3);
			list = new ArrayList<Student>();
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
				  Student st = new Student();
				  st.setSno(rs.getInt(1));
				  st.setSname(rs.getString(2));
				  st.setAddrs(rs.getString(3));
				  st.setAvg(rs.getFloat(4));
				  list.add(st);
				}
			}catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}
}
