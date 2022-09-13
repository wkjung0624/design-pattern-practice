package ch04.pizza.style.california.impl;

import ch04.pizza.Pizza;

public class CaliforniaStyleClamPizza extends Pizza {

	public CaliforniaStyleClamPizza(){
		super.setProductName("캘리포니아 스타일 해산물 피자");
	}

	@Override
	public void prepare() {
		System.out.println("캘리포니아 스타일의 피자를 준비합니다.");
		System.out.println("소스의 맛이 잘 어울려져 깊은 맛이 일품입니다.");
		System.out.println("새벽 배송으로 받은 조개를 준비합니다.");
	}

	@Override
	public void bake() {
		System.out.println("피자를 적당히 익힙니다.");
	}

	@Override
	public void cut() {
		System.out.println("무난하게 8등분으로 자릅니다.");
	}

	@Override
	public void box() {
		System.out.println("사각 박스에 잘 옮겨 담았습니다.");
	}
}
