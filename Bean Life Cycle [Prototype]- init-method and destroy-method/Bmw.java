package com.car;

public class Bmw implements Cars {
	@Override
	public String price() {
		return "BMW : Price starts from 40 Lakhs";
	}
	
	public void doInitMethod() {
		System.out.println("init method");
	}
	
	public void doDestroyMethod() {
		System.out.println("Destroy method");
	}
}
