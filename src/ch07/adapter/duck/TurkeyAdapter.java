package ch07.adapter.duck;

import ch07.adapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	final Turkey turkey;

	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0; i<5; i++) { // 오리처럼 멀리 날 수 있도록 날갯짓을 5번 반복함
			turkey.fly();
		}
	}
}
