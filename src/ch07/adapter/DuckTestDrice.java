package ch07.adapter;

import ch07.adapter.duck.Duck;
import ch07.adapter.duck.impl.MallardDuck;
import ch07.adapter.turkey.DuckAdapter;
import ch07.adapter.turkey.Turkey;
import ch07.adapter.duck.TurkeyAdapter;
import ch07.adapter.turkey.impl.WildTurkey;

public class DuckTestDrice {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		Turkey duckAdapter = new DuckAdapter(duck);

		System.out.println("칠면조가 말하길");
		turkey.gobble();
		turkey.fly();

		System.out.println("\n오리가 말하길");
		testDuck(duck);

		System.out.println("\n(오리클래스)칠면조 어댑터가 말하길");
		testDuck(turkeyAdapter);

		System.out.println("\n(칠면조클래스)오리 어댑터가 말하길");
		testTurkey(duckAdapter);
	}

	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
}

