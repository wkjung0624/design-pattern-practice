package ch04.store;

import ch04.pizza.Pizza;

public abstract class PizzaStore {
	public final Pizza orderPizza(String type){
		Pizza pizza;

		pizza = createPizza(type);	// 팩토리 객체에서 PizzaStore 에 있는 createPizza() 를 호출함.

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		System.out.println("<<완성된 피자를 받으세요>>");
		return pizza;
	}

	protected abstract Pizza createPizza(String type); // 팩토리 객체 대신 이 메서드를 사용함,

}
