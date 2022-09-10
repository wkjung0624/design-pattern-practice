package ch01.character.impl;

import ch01.character.Character;
import ch01.weapons.WeaponBehavior;

public class Knight extends Character {

	public Knight(){
		System.out.println("기사가 늠름하게 다가온다.");
	}
	public Knight(WeaponBehavior weapon){
		super.setWeapon(weapon);
		System.out.println("("+ weapon.getWeaponName() + ")를 장착한 기사가 늠름하게 다가온다.");
	}

	@Override
	public void setWeapon(WeaponBehavior weapon) {
		System.out.println("기사는 (" + weapon.getWeaponName() + ")를 집어들었다.");
		super.setWeapon(weapon);
	}

	@Override
	public void performAttack() {
		System.out.print("기사의 공격-");
		super.performAttack();
	}
}
