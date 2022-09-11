package ch03.coffee.impl;

import ch03.coffee.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		super.setDescription("최고의 다크 로스트 커피");
	}

	@Override
	public double cost() {
		return 1.99;
	}
}