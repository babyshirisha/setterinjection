package com.bridgelabz.di;

//import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam {
	
	public static void main(String[] args) {
	
			ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		Student firststd = context.getBean("first",Student.class);
		firststd.studentInfo();
		Student secondstd = context.getBean("second",Student.class);
		secondstd.studentInfo();
		
		
	}

}
