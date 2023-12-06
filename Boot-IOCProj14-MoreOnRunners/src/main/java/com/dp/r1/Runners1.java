package com.dp.r1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("runner2")
public class Runners1 implements CommandLineRunner {
	@Autowired
	ApplicationContext ctx;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runners1.run()");
	}

}
