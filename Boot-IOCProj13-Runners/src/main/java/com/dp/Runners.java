package com.dp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.dp.controller.StudentController;
import com.dp.model.Student;

@Component("runner")
public class Runners implements CommandLineRunner {
	@Autowired
	ApplicationContext ctx;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(args);
		StudentController controller = ctx.getBean("controller", StudentController.class);
		try {
		List<Student> list = controller.processStudentData("USA", "MRG", "NLG");
		list.forEach(st->{
			System.out.println(st.getResult());
		});
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
