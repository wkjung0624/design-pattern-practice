package ch07.adapter.duck.impl;

import ch07.adapter.duck.Duck;

public class MallardDuck implements Duck {


	@Override
	public void quack() {
		System.out.println("꽥!");
	}

	@Override
	public void fly() {
		System.out.println("퍼득퍼득 날갯짓");
	}
}
