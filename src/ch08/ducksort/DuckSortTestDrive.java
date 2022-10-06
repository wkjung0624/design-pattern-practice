package ch08.ducksort;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = {
			new Duck("Mr.Ducky", 10),
			new Duck("Waller Duck", 6),
			new Duck("General Duck", 1),
			new Duck("John Douck", 3),
			new Duck("Ms.Doisy", 9),
			new Duck("Ducknut", 7)
		};

		System.out.println("정렬 전 : ");
		display(ducks);

		Arrays.sort(ducks);

		System.out.println("정렬 후 : ");
		display(ducks);
	}

	public static void display(Duck[] ducks) {
		for (Duck d : ducks) {
			System.out.println(d);
		}
	}
}
