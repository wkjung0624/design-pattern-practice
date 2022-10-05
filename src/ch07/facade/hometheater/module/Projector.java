package ch07.facade.hometheater.module;

public class Projector {
	StreamingPlayer player;

	public Projector(StreamingPlayer player){
		this.player = player;
	}

	public void on(){
		System.out.println("프로젝터를 켭니다.");
	}
	public void off(){
		System.out.println("프로젝터를 끕니다.");
	}
	public void tvMode(){
		System.out.println("프로젝터를 TV 시청모드로 전환합니다.");
	}

	public void wideScreenMode() {
		System.out.println("프로젝터를 와이드 모드로 전환합니다.");
	}

}
