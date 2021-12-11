package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	// field injection
	@Autowired
	@Qualifier("webFortuneService")
	private FortuneService fortuneService;
	private FortuneService objFortuneService;
	private FortuneService obj1FortuneService;
	
	// constructor injection
	@Autowired
	public TennisCoach(@Qualifier("webFortuneService") FortuneService theFortuneService)
	{
		this.objFortuneService = theFortuneService;
	}
	
	@Autowired
	@Qualifier("webFortuneService")
	public void customFortuneService(FortuneService theFortuneService)
	{
		this.obj1FortuneService =  theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do Ball practice on the court";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() + " | " + objFortuneService.getFortune() + " | " + obj1FortuneService.getFortune();
	}
}
