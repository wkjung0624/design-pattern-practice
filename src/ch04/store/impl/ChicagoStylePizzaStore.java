package ch04.store.impl;

import ch04.pizza.Pizza;
import ch04.pizza.style.chicago.impl.ChicagoStyleCheesePizza;
import ch04.pizza.style.chicago.impl.ChicagoStyleClamPizza;
import ch04.pizza.style.chicago.impl.ChicagoStylePepperoniPizza;
import ch04.pizza.style.chicago.impl.ChicagoStyleVeggiePizza;
import ch04.store.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type){
		Pizza pizza = null;

		switch (type) {
			case "cheese":
				pizza = new ChicagoStyleCheesePizza();
				break;
			case "pepperoni":
				pizza = new ChicagoStylePepperoniPizza();
				break;
			case "clam":
				pizza = new ChicagoStyleClamPizza();
				break;
			case "veggie":
				pizza = new ChicagoStyleVeggiePizza();
				break;
		}

		return pizza;
	}
}
