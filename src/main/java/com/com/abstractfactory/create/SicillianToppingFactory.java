package com.com.abstractfactory.create;

import com.abstractfactory.Cheese;
import com.abstractfactory.MozzarellaCheese;
import com.abstractfactory.Sauce;
import com.abstractfactory.TomatoSauce;

public class SicillianToppingFactory extends BaseToppingFactory {

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}
}
