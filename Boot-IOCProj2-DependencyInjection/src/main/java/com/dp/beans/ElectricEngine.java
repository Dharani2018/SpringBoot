//ElectricEngine.java
package com.dp.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("ee")
@Lazy(true)
public class ElectricEngine implements IEngine {
	
	public ElectricEngine() {
		System.out.println("ElectricEngine.ElectricEngine()");
	}

	@Override
	public String start() {
		return "Electric engine has started";
	}

	@Override
	public String stop() {
		return "Electric engine has stopped";
	}

}
