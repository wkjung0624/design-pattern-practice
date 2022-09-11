package ch03.condiment;

import ch03.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {

	// 데코레이터가 감쌀 음료인 beverage 를 지정함
	protected Beverage beverage;
	@Override
	public abstract String getDescription();
}
