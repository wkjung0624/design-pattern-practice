package ch04.pizza.style.newyork.impl;

import ch04.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza(){
		super.setProductName("뉴욕 스타일 야채 피자");
	}
	@Override
	public void prepare() {
		System.out.println("신선한 야채를 얇게 펴올립니다.");
		System.out.println("신선한 야채를 얇게 펴올립니다.");
	}

	@Override
	public void bake() {
		System.out.println("크런키하게 고온에 굽습니다.");
	}

	@Override
	public void cut() {
		System.out.println("뉴요커는 8등분으로 Cut- 합니다. ");
	}

	@Override
	public void box() {
		System.out.println("사각 박스에 잘 옮겨 담았습니다.");
	}
}
