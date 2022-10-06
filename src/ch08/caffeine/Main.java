package ch08.caffeine;

import ch08.caffeine.impl.Coffee;
import ch08.caffeine.impl.Tea;

public class Main {

	public static void main(String[] args) {
		CaffeineBeverage coffee = new Coffee("커피");
		CaffeineBeverage tea = new Tea("홍차");

		coffee.prepareRecipe();
		tea.prepareRecipe();
	}
}
