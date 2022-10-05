package ch07.adapter.turkey;

import ch07.adapter.duck.Duck;
import java.util.Random;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;
	public DuckAdapter(Duck duck){
		rand = new Random();
		this.duck = duck;
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if(rand.nextInt(5) == 0){
			duck.fly();
		} else {
			System.out.println("날갯짓을 하지 못했어요.");
		}
	}
}
