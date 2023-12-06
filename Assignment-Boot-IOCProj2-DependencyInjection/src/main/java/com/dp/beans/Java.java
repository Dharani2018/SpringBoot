//Java.java
package com.dp.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
@Primary
public class Java implements ICourseMaterial {

	@Override
	public String registeredCourse() {
		return "Welcome! you are registered for Java course";
	}

	@Override
	public String coursFee() {
		return "Course fee for java is 25000";
	}

}
