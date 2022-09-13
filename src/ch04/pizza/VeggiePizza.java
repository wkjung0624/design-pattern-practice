package ch04.pizza;

public abstract class VeggiePizza extends Pizza {
	public VeggiePizza(){
		super.setProductName("신선함이 가득한 채소 피자");
	}
	@Override
	public void prepare(){
		System.out.println("건강에 좋은 채소를 가져왔습니다.");
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
