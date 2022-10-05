package ch07.facade.hometheater.module;

public class PopcornPopper {
	public void on(){
		System.out.println("팝콘 기계를 켰습니다.");
	}
	public void off(){
		System.out.println("팝콘 기계를 껐습니다.");
	}
	public void pop(){
		System.out.println("팝콘을 만듭니다.");
	}
}
