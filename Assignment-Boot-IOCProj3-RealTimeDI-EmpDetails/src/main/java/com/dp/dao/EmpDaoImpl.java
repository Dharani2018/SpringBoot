package com.dp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dp.model.Emp;
@Repository("dao")
public class EmpDaoImpl implements IEmpDao {
	@Autowired
	private DataSource datasource;
	private static final String query = "SELECT * FROM EMP WHERE EMPDESG IN (?,?,?)";

	@Override
	public List<Emp> getAllEmpDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Emp> empList;
		try(Connection con = datasource.getConnection(); 
				PreparedStatement ps = con.prepareStatement(query)){
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			empList = new ArrayList<Emp>();
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					Emp emp = new Emp();
					emp.setEmpNo(rs.getInt(1));
					emp.setEmpName(rs.getString(2));
					emp.setEmpAddrs(rs.getString(3));
					emp.setSal(rs.getInt(4));
					empList.add(emp);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
			
		
		
		return empList;
	}

}
