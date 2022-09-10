package ch01.weapons.impl;

import ch01.weapons.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

	String weaponName = "장검";
	@Override
	public void attack() {
		System.out.println("칼로 도륙낸다!");
	}

	public String getWeaponName(){
		return weaponName;
	}
}
