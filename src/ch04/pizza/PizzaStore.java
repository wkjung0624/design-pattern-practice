package ch04.pizza;

public class PizzaStore {
	SimplePizzaFactory factory; // PizzaStore 에 SimplePizzaFactory 레퍼런스 저장

	public PizzaStore(SimplePizzaFactory factory) { // PizzaStore 생성자에 팩토리 객체를 전달해줌
		this.factory = factory;
	}

	public Pizza orderPizza(String type){
		Pizza pizza;

		pizza = factory.createPizza(type);	// orderPizza() 메소드는 팩토리로 피자 객체를 만듦, 팩토리에 요청사항 전달

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		System.out.println("<<완성된 피자를 받으세요>>");
		return pizza;
	}
}
