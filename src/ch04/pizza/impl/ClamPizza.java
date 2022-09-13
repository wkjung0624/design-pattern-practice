package ch04.pizza.impl;

import ch04.pizza.Pizza;

public class ClamPizza extends Pizza {
	public ClamPizza(){
		super.setProductName("바다사랑 조개피자");
	}
	public void prepare(){
		System.out.println("싱싱한 조개를 가져왔습니다.");
		System.out.println("도우를 얇게 폈습니다.");
		System.out.println("피자를 구울 준비가 다 됐습니다!");
	}
	public void bake(){
		System.out.println("이제 피자를 구웠습니다.");
	}
	public void cut(){
		System.out.println("피자를 먹기좋게 잘랐습니다.");
	}
	public void box(){
		System.out.println("피자를 상자에 예쁘게 담았습니다 :)");
	}
}
