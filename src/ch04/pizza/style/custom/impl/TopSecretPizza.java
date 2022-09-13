package ch04.pizza.style.custom.impl;

import ch04.pizza.Pizza;

public class TopSecretPizza extends Pizza {

	public TopSecretPizza(){
		super.setProductName("궁극의 레시피로 만들어진 피자");
	}
	@Override
	public void prepare() {
		System.out.println("암거래로 비밀 재료를 공수받습니다.");
		System.out.println("비밀재료는 보이지 않게 치즈 밑에 숨깁니다.");
	}

	@Override
	public void bake() {
		System.out.println("용암열 오븐에서 바싹 구워줍니다.");
	}

	@Override
	public void cut() {
		System.out.println("장미칼로 255등분 합니다.");
	}

	@Override
	public void box() {
		System.out.println("피자를 특수 가공된 초경량 합금 박스에 넣습니다.");
	}
}
