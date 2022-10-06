package ch08.caffeine;

public abstract class CaffeineBeverage {
	protected String name;

	protected CaffeineBeverage(String name){
		this.name = name;
	}
	protected final void prepareRecipe() {
		System.out.println("-------------------");
		System.out.println("-   " + this.name + "를 준비한다   -");
		System.out.println("-------------------");
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		System.out.println("-------------------\n");
	}

	protected abstract void brew();
	protected abstract void addCondiments();
	protected void boilWater() {
		System.out.println("(고정)물 끓이는 중");
	}
	protected void pourInCup() {
		System.out.println("(고정)컵에 따르는 중");
	}
}
