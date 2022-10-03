package ch06.external;

public class LivingRoom extends Light{

	@Override
	public void on(){
		System.out.println("거실 조명이 켜졌습니다.");
	}

	@Override
	public void off(){
		System.out.println("거실 조명이 꺼졌습니다.");
	}
}
