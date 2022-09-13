package ch04.pizza.style.chicago.impl;

import ch04.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza(){
		super.setProductName("시카고 스타일 야채 피자");
	}

	@Override
	public void prepare() {
		System.out.println("시카고 스타일의 피자를 준비합니다.");
		System.out.println("찐한 치즈를 가득 준비합니다.");
		System.out.println("신선한 야채를 층층히 쌓습니다.");
	}

	@Override
	public void bake() {
		System.out.println("피자 내부가 잘 익도록 오래 익힙니다.");
	}

	@Override
	public void cut() {
		System.out.println("시카고는 6등분으로 자릅니다. 너무 두껍기 때문이죠.");
	}

	@Override
	public void box() {
		System.out.println("육각 박스에 잘 옮겨 담았습니다.");
	}
}
