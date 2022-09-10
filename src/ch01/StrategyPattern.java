package ch01;

// 공통되는 부분과 그렇지 않는 부분을 구분함
// "구현" 보다는 "인터페이스" 에 맞춰서 개발함
// Fly 은 Quack() 은 별도의 클래스 집합으로 분리되어 있음
// 이렇게 코딩한다면 프로그램 실행 중에도 Duck 클래스의 세부 구현을 바꿀 수 있음

import ch01.character.Character;
import ch01.character.impl.King;
import ch01.character.impl.Knight;
import ch01.character.impl.Queen;
import ch01.character.impl.Troll;
import ch01.weapons.impl.AxeBehavior;
import ch01.weapons.impl.BowAndArrowBehavior;
import ch01.weapons.impl.KnifeBehavior;
import ch01.weapons.impl.SwordBehavior;

public class StrategyPattern {
	public static void main(String[] args) {
		Character king = new King();
		Character knight = new Knight(new SwordBehavior());
		Character queen = new Queen();
		Character troll = new Troll(new KnifeBehavior());

		System.out.println("");

		queen.setWeapon(new AxeBehavior());
		queen.performAttack();

		System.out.println("");

		king.setWeapon(new BowAndArrowBehavior());
		king.performAttack();

		System.out.println("");

		knight.performAttack();
		king.performAttack();
		troll.performAttack();
	}
}