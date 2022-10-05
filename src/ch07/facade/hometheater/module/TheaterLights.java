package ch07.facade.hometheater.module;

public class TheaterLights {
	int light;

	public TheaterLights(){
		this.light = 0;
	}
	public void on(){
		System.out.println("상영관 조명을 켭니다.");
	}
	public void off(){
		System.out.println("상영관 조명을 끕니다.");
	}
	public void dim(int light){
		this.light = light;
		System.out.println("밝기를 " + light + " 로 조정합니다.");
	}
}
