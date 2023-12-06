//PetrolEngine.java
package com.dp.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pe")
@Lazy(true)
public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}

	@Override
	public String start() {
		return "Petrol engine has started";
	}

	@Override
	public String stop() {
		return "Petrol engine has stopped";
	}

}
