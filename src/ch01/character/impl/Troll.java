package ch01.character.impl;

import ch01.character.Character;
import ch01.weapons.WeaponBehavior;

public class Troll extends Character {

	public Troll(){
		System.out.println("냄새나는 트롤이 튀어나왔다.");
	}
	public Troll(WeaponBehavior weapon){
		super.setWeapon(weapon);
		System.out.println("("+ weapon.getWeaponName() + ")를 장착한 트롤이 튀어나왔다.");
	}

	@Override
	public void setWeapon(WeaponBehavior weapon) {
		System.out.println("트롤 (" + weapon.getWeaponName() + ")를 집어들었다.");
		super.setWeapon(weapon);
	}

	@Override
	public void performAttack() {
		System.out.print("트롤의 공격-");
		super.performAttack();
	}
}
