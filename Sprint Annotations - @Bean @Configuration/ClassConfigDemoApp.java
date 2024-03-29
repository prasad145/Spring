package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClassConfigDemoApp {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}
}