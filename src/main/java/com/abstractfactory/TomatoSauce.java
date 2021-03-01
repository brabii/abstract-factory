package com.abstractfactory;

public class TomatoSauce implements Sauce {

	public TomatoSauce() {
		prepareSauce();
	}

	@Override
	public void prepareSauce() {
		System.out.println("preparing tomato sauce ...");
	}
}
