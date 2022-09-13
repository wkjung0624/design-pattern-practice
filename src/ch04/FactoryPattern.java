package ch04;

import ch04.pizza.Pizza;
import ch04.store.PizzaStore;
import ch04.store.impl.CaliforniaStylePizzaStore;
import ch04.store.impl.MyCustomStylePizzaStore;

public class FactoryPattern {
	public static void main(String[] args) {

		PizzaStore pizzaStore = new CaliforniaStylePizzaStore();
		Pizza myPizza = pizzaStore.orderPizza("clam");
		System.out.println("주문한 피자는: \"" + myPizza.getProductName() + "\" 입니다.\n");

		PizzaStore myCustomPizzaStore = new MyCustomStylePizzaStore();
		myPizza = myCustomPizzaStore.orderPizza("cheesebomb");
		System.out.println("주문한 피자는: \"" + myPizza.getProductName() + "\" 입니다.");
	}
}
