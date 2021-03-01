package com.com.abstractfactory.create;

import com.abstractfactory.Cheese;
import com.abstractfactory.Sauce;

public abstract class BaseToppingFactory {
	public abstract Cheese createCheese();

	public abstract Sauce createSauce();
}
