package ch04.store.impl;

import ch04.pizza.Pizza;
import ch04.pizza.style.custom.impl.CheeseBombPizza;
import ch04.pizza.style.custom.impl.SpecialCombinationPizza;
import ch04.pizza.style.custom.impl.TopSecretPizza;
import ch04.store.PizzaStore;

public class MyCustomStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;

		switch(type){
			case "cheesebomb":
				pizza = new CheeseBombPizza();
				break;
			case "secret":
				pizza = new TopSecretPizza();
				break;
			case "combination":
				pizza = new SpecialCombinationPizza();
				break;
		}

		return pizza;
	}
}
