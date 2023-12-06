//DotNet.java
package com.dp.beans;

import org.springframework.stereotype.Component;

@Component("dotNet")
public class DotNet implements ICourseMaterial {

	@Override
	public String registeredCourse() {
		return "Welcome! you are registered for .Net course";
	}

	@Override
	public String coursFee() {
		return "Course fee for .Net is 20000";
	}

}
