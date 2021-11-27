package com.test;

public class MainApp {
	public static void main(String[] args)
	{
		coach theCoach = new BasketballCoach();
		System.out.println(theCoach.getDailyWorkout());
	}
}
