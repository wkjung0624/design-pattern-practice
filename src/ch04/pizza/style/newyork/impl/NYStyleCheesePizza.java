package ch04.pizza.style.newyork.impl;

import ch04.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza(){
		super.setProductName("뉴욕 스타일 치즈 피자");
	}

	@Override
	public void prepare() {
		System.out.println("뉴욕 스타일의 피자를 준비합니다.");
		System.out.println("찐한 치즈를 가득 준비합니다.");
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
