package ch03.coffee.impl;

import ch03.coffee.Beverage;

public class Espresso extends Beverage {

	public Espresso(){
		// Beverage 의 description 인스턴스를 받아와서 값 변경
		super.setDescription("에스프레소");
	}

	@Override
	public double cost() {
		// 첨가물의 가격을 고려하지않은 순수한 에스프레소 가격만 고려
		return 1.99;
	}
}
