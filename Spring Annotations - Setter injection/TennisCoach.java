package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
//	public TennisCoach(FortuneService theFortuneService)
//	{
//	}
	
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		this.fortuneService =  theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do Ball practice on the court";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
