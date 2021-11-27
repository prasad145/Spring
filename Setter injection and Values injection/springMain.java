package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springMain {
	public static void main(String[] args)
	{
		// load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		// retrieve the bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//calling the dependency 
		System.out.println(theCoach.getDailyFortune());
		
		//call methods to get the literal value!
		System.out.println("Email: " + theCoach.getEmailAddress());
		
		System.out.println("Team name: " + theCoach.getTeam());
		
		//call the methods to get the values from property file
		System.out.println("Location: " + theCoach.getLocation());

		System.out.println("Motto: " + theCoach.getMotto());
		//close the context
		context.close();
	}
}
