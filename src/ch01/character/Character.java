package ch01.character;

import ch01.weapons.WeaponBehavior;
import java.util.Objects;

public abstract class Character {
	protected WeaponBehavior weapon;

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}

	public void performAttack(){
		if(Objects.equals(weapon, null)){
			System.out.println("무기가 없어 공격할 수 없다.");
		}
		else{
			weapon.attack();
		}
	}
}
