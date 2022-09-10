package ch01.weapons.impl;

import ch01.weapons.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

	String weaponName = "도끼";
	@Override
	public void attack() {
		System.out.println("도끼로 찍는다");
	}

	@Override
	public String getWeaponName(){
		return weaponName;
	}
}
