package ch04.pizza.style.custom.impl;

import ch04.pizza.Pizza;

public class SpecialCombinationPizza extends Pizza {

	public SpecialCombinationPizza(){
		super.setProductName("최고의 콤비네이션 피자");
	}

	@Override
	public void prepare() {
		System.out.println("전국 각지에서 받은 최고의 햄, 치즈, 야채를 공수받습니다.");
		System.out.println("넉넉하게 도우 위에 쌓아 올립니다.");
	}

	@Override
	public void bake() {
		System.out.println("황금빛이 나는 오븐에서 적절하게 구워줍니다.");
	}

	@Override
	public void cut() {
		System.out.println("다이아몬드 커팅기로 정확히 8등분 합니다.");
	}

	@Override
	public void box() {
		System.out.println("피자를 도금된 종이 박스에 넣습니다.");
	}
}
