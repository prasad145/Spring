package com.test;

public class TrackCoach implements coach{
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run for 4k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it : " + fortuneService.getFortune();
	}
}
