package com.dp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.dp.controller.EmpController;
import com.dp.model.Emp;

@SpringBootApplication
@ImportResource("com/dp/cfgs/applicationContext.xml")
public class BootIocProj04RealTimeDiEmpDetailsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj04RealTimeDiEmpDetailsApplication.class, args);
		EmpController empController = ctx.getBean("empController", EmpController.class);
		try {
			List<Emp> empList = empController.getEmployeeDetails("SE", "SD", "TSE");
			empList.forEach(e->System.out.println(e.getResult()));
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
