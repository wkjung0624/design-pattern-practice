package ch06.external;

public class Stereo {
	int volume;
	public void turnOn() {
		System.out.println("스피커를 켰습니다.");
	}
	public void setCD(){
		System.out.println("CD를 인식합니다.");
	}
	public void setMusic(){
		System.out.println("음악을 선택합니다.");
	}
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("소리 크기를 " + volume + " 으로 설정합니다.");
	}
	public void turnOff() {
		System.out.println("스피커를 껐습니다.");
	}
}
