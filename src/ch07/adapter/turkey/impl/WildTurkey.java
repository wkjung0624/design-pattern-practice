package ch07.adapter.turkey.impl;

import ch07.adapter.turkey.Turkey;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("골골거리기");
	}

	@Override
	public void fly() {
		System.out.println("짧은 거리를 날고 있어요!");
	}
}
