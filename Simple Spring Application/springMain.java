package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springMain {
	public static void main(String[] args)
	{
		// load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		// retrieve the bean from spring container
		coach theCoach = context.getBean("myCoach", coach.class);
		
		//call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}
}
