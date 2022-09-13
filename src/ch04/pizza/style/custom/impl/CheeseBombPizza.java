package ch04.pizza.style.custom.impl;

import ch04.pizza.Pizza;

public class CheeseBombPizza extends Pizza {

	public CheeseBombPizza(){
		super.setProductName("No.1 치즈 폭탄 피자");
	}

	@Override
	public void prepare() {
		System.out.println("더 많은 치즈, 치즈, 치즈");
		System.out.println("치즈에, 치즈에 의한, 치즈를 위한 치즈피자를 준비합니다.");
	}

	@Override
	public void bake() {
		System.out.println("정통있는 오래된 화덕에서 구워줍니다.");
	}

	@Override
	public void cut() {
		System.out.println("언제 사용했는지 모를 낡은 칼로 8등분합니다.");
	}

	@Override
	public void box() {
		System.out.println("피자를 나무로 된 넓은 사각 박스에 넣습니다.");
	}
}
