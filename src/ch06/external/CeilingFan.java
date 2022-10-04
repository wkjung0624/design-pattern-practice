package ch06.external;

public class CeilingFan {
	public static final int SPEED_HIGH = 3;
	public static final int SPEED_MEDIUM = 2;
	public static final int SPEED_LOW = 1;
	public static final int SPEED_OFF = 0;
	String location;
	int speed;

	public CeilingFan(String location) {
		this.location = location;
		speed = SPEED_OFF;
	}

	public void high() {
		speed = SPEED_HIGH;
		System.out.println("선풍기 속도를 '최대'로 설정합니다.");
		// 선풍기 속도를 HIGH 로 맞추는 코드
	}

	public void medium() {
		speed = SPEED_MEDIUM;
		System.out.println("선풍기 속도를 '중간'로 설정합니다.");
		// 선풍기 속도를 MEDIUM 으로 맞추는 코드
	}

	public void low() {
		speed = SPEED_LOW;
		System.out.println("선풍기 속도를 '약하게'로 설정합니다.");
		// 선풍기 속도를 LOW 로 맞추는 코드
	}

	public void off() {
		speed = SPEED_OFF;
		System.out.println("선풍기를 끕니다.");
		// 선풍기를 끄는 코드
	}

	public int getSpeed() {
		return speed;
	}
}
