package ch04.store.impl;

import ch04.pizza.Pizza;
import ch04.pizza.style.newyork.impl.NYStyleCheesePizza;
import ch04.pizza.style.newyork.impl.NYStyleClamPizza;
import ch04.pizza.style.newyork.impl.NYStylePepperoniPizza;
import ch04.pizza.style.newyork.impl.NYStyleVeggiePizza;
import ch04.store.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type){
		Pizza pizza = null;

		switch (type) {
			case "cheese":
				pizza = new NYStyleCheesePizza();
				break;
			case "pepperoni":
				pizza = new NYStylePepperoniPizza();
				break;
			case "clam":
				pizza = new NYStyleClamPizza();
				break;
			case "veggie":
				pizza = new NYStyleVeggiePizza();
				break;
		}

		return pizza;
	}
}
