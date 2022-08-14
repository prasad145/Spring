package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class WebFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Web fortune Serivce";
	}

}
