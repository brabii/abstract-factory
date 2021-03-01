package com.com.abstractfactory.create;

import com.abstractfactory.CaliforniaOilSauce;
import com.abstractfactory.Cheese;
import com.abstractfactory.GoatCheese;
import com.abstractfactory.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {

	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public Sauce createSauce() {
		return new CaliforniaOilSauce();
	}

}
