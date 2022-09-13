package ch04;

import ch04.pizza.Pizza;
import ch04.pizza.PizzaStore;
import ch04.pizza.SimplePizzaFactory;

public class FactoryPattern {
	public static void main(String[] args) {

		PizzaStore pizzaStore = new PizzaStore(SimplePizzaFactory.getInstance());

		Pizza myPizza = pizzaStore.orderPizza("clam");

		System.out.println("주문한 피자는: \"" + myPizza.getProductName() + "\" 입니다.");
	}
}
