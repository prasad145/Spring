package com.car;

import org.springframework.beans.factory.DisposableBean;

public class Benz implements Cars, DisposableBean {
	@Override
	public String price() {
		// TODO Auto-generated method stub
		return "Benz : Price starts from 41 Lakhs";
	}
	
	public void doInitMethod() {
		System.out.println("init method");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destory method");
	}
}
