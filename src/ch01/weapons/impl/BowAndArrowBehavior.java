package ch01.weapons.impl;

import ch01.weapons.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

	String weaponName = "활과 화살";
	@Override
	public void attack() {
		System.out.println("화살을 피유웅-");
	}

	public String getWeaponName(){
		return weaponName;
	}
}
