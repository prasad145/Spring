package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService obj1FortuneService;
	private FortuneService obj2FortuneService;
	
		
	// method injection
	@Autowired
	public void customFrotuneService(FortuneService theFortuneService)
	{
		this.obj2FortuneService =  theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do Ball practice on the court";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Field injection : " + obj1FortuneService.getFortune() + "\nMethod Injection : " + obj2FortuneService.getFortune();
	}

}
