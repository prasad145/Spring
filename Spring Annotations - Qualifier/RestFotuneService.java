package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class RestFotuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "RESTful fortune Service";
	}

}
