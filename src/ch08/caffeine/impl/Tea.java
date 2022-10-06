package ch08.caffeine.impl;

import ch08.caffeine.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

	public Tea(String name) {
		super(name);
	}

	@Override
	protected void brew() {

		System.out.println("찻잎을 우려내는 중");
	}

	@Override
	public void	addCondiments() {
		System.out.println("레몬을 추가하는 중");
	}
}
