package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dp.dao.IStudentDAO;
import com.dp.model.Student;

@Service("service")
public class StudentServiceImpl implements IStudentService {
	@Autowired
	@Qualifier("finalDao")
	private IStudentDAO sdao;

	@Override
	public List<Student> fetchAllStudentDetails(String city1, String city2, String city3) throws Exception {
		List<Student> list = sdao.getAllStudentDetailsByAddress(city1, city2, city3);
		list.forEach( st->{
			String result= null;
			if(st.getAvg()<35)
				result = "FAIL";
			else if (st.getAvg()>35 && st.getAvg()<50) {
				result = "Third class";
			}else if (st.getAvg()>50 && st.getAvg()<70) {
				result = "Second class";
			}else if (st.getAvg()>70 && st.getAvg()<80) {
				result = "First class";
			}else {
				result = "First class with distinction";
			}
			st.setResult(result);
				
		});
		return list;
	}

}
