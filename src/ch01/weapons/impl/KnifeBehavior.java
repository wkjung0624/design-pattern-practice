package ch01.weapons.impl;

import ch01.weapons.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

	String weaponName = "단검";
	@Override
	public void attack() {
		System.out.println("단검으로 푸슉-");
	}

	public String getWeaponName(){
		return weaponName;
	}
}
