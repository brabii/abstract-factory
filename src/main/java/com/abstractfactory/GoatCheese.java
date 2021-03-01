package com.abstractfactory;

public class GoatCheese implements Cheese {
	public GoatCheese() {
		prepareCheese();
	}

	@Override
	public void prepareCheese() {
		System.out.println("preparing gaot cheese...");
	}
}
