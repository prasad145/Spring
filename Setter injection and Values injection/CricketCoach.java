package com.test;

public class CricketCoach implements coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	private String location;
	private String motto;

	public CricketCoach() {
		System.out.println("this is no-arg constructor for CricketCoach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting for one hour";
	}

	@Override
	public String getDailyFortune() {
		return "Bat like sachin : " + fortuneService.getFortune();
	}

}
