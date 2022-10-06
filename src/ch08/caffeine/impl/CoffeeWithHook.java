package ch08.caffeine.impl;

import ch08.caffeine.CaffeineBeverageWithHook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Locale;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	public CoffeeWithHook(String name) {
		super(name);
	}

	@Override
	public void brew() {
		System.out.println("필터로 커피를 우려내는 중");
	}

	@Override
	public void	addCondiments() {
		System.out.println("설탕과 우유를 추가하는 중");
	}

	@Override
	public boolean customerWantsCondiments(){
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.out.println("IO 오류");
		}

		if (answer == null) {
			return "no";
		}

		return answer;
	}
}
