package com.abstractfactory;

public class CaliforniaOilSauce implements Sauce {

	public CaliforniaOilSauce() {
		prepareSauce();
	}

	@Override
	public void prepareSauce() {
		System.out.println("preparing california oil sauce...");
	}
}
