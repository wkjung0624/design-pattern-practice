package ch01.character.impl;

import ch01.character.Character;
import ch01.weapons.WeaponBehavior;

public class Queen extends Character {

	public Queen(){
		System.out.println("여왕님이 아름답게 걸어온다.");
	}

	public Queen(WeaponBehavior weapon){
		super.setWeapon(weapon);
		System.out.println("("+ weapon.getWeaponName() + ")를 장착한 여왕님이 아름답게 걸어온다.");
	}

	@Override
	public void setWeapon(WeaponBehavior weapon) {
		System.out.println("여왕님은 (" + weapon.getWeaponName() + ")를 집어들었다.");
		this.weapon = weapon;
	}

	@Override
	public void performAttack() {

		System.out.print("여왕의 공격-");
		super.performAttack();
	}
}
