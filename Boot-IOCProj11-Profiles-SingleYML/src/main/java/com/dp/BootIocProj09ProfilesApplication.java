package com.dp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.dp.controller.StudentController;
import com.dp.model.Student;

@SpringBootApplication
public class BootIocProj09ProfilesApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BootIocProj09ProfilesApplication.class);
		app.setAdditionalProfiles("uat");
		ApplicationContext ctx = app.run(args);
		//ApplicationContext ctx = SpringApplication.run(BootIocProj09ProfilesApplication.class, args);
		StudentController controller = ctx.getBean("controller", StudentController.class);
		try {
			List<Student> list = controller.getStudentList("BNL", "NLG", "USA");
			list.forEach(st->{
				System.out.println(st.getResult());
			});
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
