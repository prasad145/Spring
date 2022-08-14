package com.springDemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 69 meters for warm-up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
