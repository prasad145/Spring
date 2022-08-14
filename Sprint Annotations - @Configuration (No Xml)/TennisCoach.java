package com.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Value("${foo.email}")
	public String email;
	
	@Value("${foo.team}")
	public String team;
	
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
	
	@PostConstruct
	public void doMyStartup()
	{
		System.out.println("start-up");
	}
	
	@PreDestroy
	public void doMyCleanUp()
	{
		System.out.println("clean-up");
	}
	
	@Autowired
	@Qualifier("webFortuneService")
	public void customFortuneService(FortuneService theFortuneService)
	{
		this.obj1FortuneService =  theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Name : " + team + "\nEmail : " + email + "\nDo Ball practice on the court";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() + " | " + objFortuneService.getFortune() + " | " + obj1FortuneService.getFortune();
	}
}
