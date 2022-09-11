package ch03.condiment.impl;

import ch03.coffee.Beverage;
import ch03.condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage){
		super.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.33;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}
}
