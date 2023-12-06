package com.dp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import com.dp.controller.StudentController;
import com.dp.model.Student;

@SpringBootApplication
public class BootIocProj03RealTimeDiMiniProjectApplication {

	@Autowired
	ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(BootIocProj03RealTimeDiMiniProjectApplication.class, args);
	}
	
	@Bean
	@Order(1)
	public CommandLineRunner commandRunner() {
		
		CommandLineRunner runner = (String[] args) -> {
			StudentController controller = ctx.getBean("controller", StudentController.class);
			try {
			List<Student> list = controller.processStudentData("USA", "MRG", "NLG");
			list.forEach(st->{
				System.out.println("in comandLineRunner "+st.getResult());
			});
			}catch (Exception e) {
				e.printStackTrace();
			}
		};
		return runner;
	}

	
	@Bean
	@Order(10)
	public ApplicationRunner appRunner() {
		ApplicationRunner runner = (ApplicationArguments args)->{
			
			StudentController controller = ctx.getBean("controller", StudentController.class);
			try {
			List<Student> list = controller.processStudentData("USA", "MRG", "NLG");
			list.forEach(st->{
				System.out.println(st.getResult());
			});
			}catch (Exception e) {
				e.printStackTrace();
			}
		};
		return runner;
		
	}
	
	
}
