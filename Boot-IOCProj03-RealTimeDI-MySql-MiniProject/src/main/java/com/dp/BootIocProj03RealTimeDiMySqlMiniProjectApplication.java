package com.dp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.dp.controller.StudentController;
import com.dp.model.Student;

@SpringBootApplication
@ImportResource("com/dp/cfgs/applicationContext.xml")
public class BootIocProj03RealTimeDiMySqlMiniProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj03RealTimeDiMySqlMiniProjectApplication.class, args);
		StudentController controller = ctx.getBean("controller", StudentController.class);
		try {
		List<Student> list = controller.processStudentData("Chennai", "Mumbai", "NLG");
		list.forEach(st->{
			System.out.println(st.getResult());
		});
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
