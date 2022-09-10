package ch01.character.impl;

import ch01.character.Character;
import ch01.weapons.WeaponBehavior;

public class King extends Character {

	public King(){
		System.out.println("왕이 등장한다.");
	}
	public King(WeaponBehavior weapon){
		super.setWeapon(weapon);
		System.out.println("("+ weapon.getWeaponName() + ")를 장착한 왕이 등장했다.");
	}

	@Override
	public void setWeapon(WeaponBehavior weapon) {
		System.out.println("왕은 (" + weapon.getWeaponName() + ")를 집어들었다.");
		super.setWeapon(weapon);
	}

	@Override
	public void performAttack() {
		System.out.print("왕의 공격-");
		super.performAttack();
	}
}
