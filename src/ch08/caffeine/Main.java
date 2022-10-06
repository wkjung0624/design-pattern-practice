package ch08.caffeine;

import ch08.caffeine.impl.CoffeeWithHook;
import ch08.caffeine.impl.Tea;

public class Main {

	public static void main(String[] args) {
		CaffeineBeverageWithHook coffee = new CoffeeWithHook("커피");
		CaffeineBeverageWithHook tea = new Tea("홍차");

		coffee.prepareRecipe();
		tea.prepareRecipe();
	}
}
