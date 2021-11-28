package com.car;

public class Benz implements Cars {
	@Override
	public String price() {
		// TODO Auto-generated method stub
		return "Benz : Price starts from 41 Lakhs";
	}
	
	public void doInitMethod() {
		System.out.println("init method");
	}
	
	public void doDestroyMethod() {
		System.out.println("Destroy method");
	}
}
