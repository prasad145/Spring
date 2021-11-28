package com.car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springCarsMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cars-applicationContext.xml");
		
		Cars car = context.getBean("myCars", Cars.class);
		
		System.out.println(car.price());
		
		context.close();
	}
}
