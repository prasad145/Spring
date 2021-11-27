package com.test;

public class BasketballCoach implements coach{
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	public BasketballCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "today practice basketball in ground for 3 hours!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
