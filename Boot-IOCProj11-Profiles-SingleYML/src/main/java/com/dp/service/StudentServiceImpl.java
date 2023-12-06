package com.dp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.dao.IStudentDao;
import com.dp.model.Student;

@Service("service")
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDao sdao;
	
	private List<Student> list;
	

	@Override
	public List<Student> getStudentList(String s1, String s2, String s3) throws Exception {
		
		list = sdao.fetchAllStudentDetailsByAddrs(s1, s2, s3);
		list.forEach(st ->{
			if(st.getAvg()<=35) {
				st.setResult(st.getSname()+ " has failed");
			}else if (st.getAvg()<=60) {
				st.setResult(st.getSname()+ " has passed in third class");
			}else if(st.getAvg()<=70) {
				st.setResult(st.getSname()+ " has passed in second class");
			}else if(st.getAvg()<=80) {
				st.setResult(st.getSname()+ " has passed in first class");
			}else {
				st.setResult(st.getSname()+ " has passed in distinction");
			}
			
		});
		return list;
	}

}
