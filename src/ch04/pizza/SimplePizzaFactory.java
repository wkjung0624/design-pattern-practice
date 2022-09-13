package ch04.pizza;

import ch04.pizza.impl.CheesePizza;
import ch04.pizza.impl.ClamPizza;
import ch04.pizza.impl.PepperoniPizza;
import ch04.pizza.impl.VeggiePizza;

public class SimplePizzaFactory {

	public static SimplePizzaFactory getInstance(){
		return new SimplePizzaFactory();
	}
	public Pizza createPizza(String type){
		Pizza pizza = null;

		switch (type) {
			case "cheese":
				pizza = new CheesePizza();
				break;
			case "pepperoni":
				pizza = new PepperoniPizza();
				break;
			case "clam":
				pizza = new ClamPizza();
				break;
			case "veggie":
				pizza = new VeggiePizza();
				break;
		}

		return pizza;
	}
}
