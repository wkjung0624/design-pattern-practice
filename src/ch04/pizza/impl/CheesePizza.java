package ch04.pizza.impl;

import ch04.pizza.Pizza;

public class CheesePizza extends Pizza {

	public CheesePizza(){
		super.setProductName("풍미 깊은 치즈 피자");
	}
	@Override
	public void prepare(){
		System.out.println("고품질 치즈를 가져왔습니다.");
		System.out.println("도우를 얇게 폈습니다.");
		System.out.println("피자를 구울 준비가 다 됐습니다!");
	}
	@Override
	public void bake(){
		System.out.println("이제 피자를 구웠습니다.");
	}
	@Override
	public void cut(){
		System.out.println("피자를 먹기좋게 잘랐습니다.");
	}
	@Override
	public void box(){
		System.out.println("피자를 상자에 예쁘게 담았습니다 :)");
	}
}
