//DieselEngine.java
package com.dp.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("de")
@Lazy(true)
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}

	@Override
	public String start() {
		return "Diesel engine has started";
	}

	@Override
	public String stop() {
		return "Diesel engine has stopped";
	}

}
