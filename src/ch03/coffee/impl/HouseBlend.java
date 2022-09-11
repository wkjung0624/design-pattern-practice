package ch03.coffee.impl;

import ch03.coffee.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		super.setDescription("하우스 블랜드 커피");
	}

	@Override
	public double cost() {
		return .99;
	}
}
