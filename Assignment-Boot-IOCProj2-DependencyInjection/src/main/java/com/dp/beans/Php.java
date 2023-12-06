//Php.java
package com.dp.beans;

import org.springframework.stereotype.Component;

@Component("php")
public class Php implements ICourseMaterial {

	@Override
	public String registeredCourse() {
		return "Welcome! you are registered for Php course" ;
	}

	@Override
	public String coursFee() {
		return "Course fee for php is 10000";
	}

}
