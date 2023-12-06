//CNGEngine.java
package com.dp.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cng")
//@Primary
@Lazy(true)
public class CNGEngine implements IEngine {

	public CNGEngine() {
		System.out.println("CNGEngine.CNGEngine()");
	}
	
	@Override
	public String start() {
		return "CNG engine has started";
	}

	@Override
	public String stop() {
		return "CNG engine has stopped";
	}

}
