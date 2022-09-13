package ch04.store.impl;

import ch04.pizza.CheesePizza;
import ch04.pizza.ClamPizza;
import ch04.pizza.PepperoniPizza;
import ch04.pizza.Pizza;
import ch04.pizza.VeggiePizza;
import ch04.pizza.style.california.impl.CaliforniaStyleCheesePizza;
import ch04.pizza.style.california.impl.CaliforniaStyleClamPizza;
import ch04.pizza.style.california.impl.CaliforniaStylePepperoniPizza;
import ch04.pizza.style.california.impl.CaliforniaStyleVeggiePizza;
import ch04.store.PizzaStore;

public class CaliforniaStylePizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type){
		Pizza pizza = null;

		switch (type) {
			case "cheese":
				pizza = new CaliforniaStyleCheesePizza();
				break;
			case "pepperoni":
				pizza = new CaliforniaStylePepperoniPizza();
				break;
			case "clam":
				pizza = new CaliforniaStyleClamPizza();
				break;
			case "veggie":
				pizza = new CaliforniaStyleVeggiePizza();
				break;
		}

		return pizza;
	}
}
