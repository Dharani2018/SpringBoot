package com.dp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.dp.controller.StudentController;
import com.dp.model.Student;

@SpringBootApplication
public class BootIocProj03RealTimeDiMiniProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj03RealTimeDiMiniProjectApplication.class, args);
		StudentController controller = ctx.getBean("controller", StudentController.class);
		try {
		List<Student> list = controller.processStudentData("USA", "MRG", "NLG");
		list.forEach(st->{
			System.out.println(st.getResult());
		});
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
