package ch07.facade.hometheater.module;

public class Tuner {
	Amplifier amplifier;
	boolean amMode;
	double frequency;

	public Tuner(Amplifier amplifier){
		this.amplifier = amplifier;
		amMode = false;
	}

	public void on(){
		System.out.println("튜너를 켰습니다.");
	}
	public void off(){
		System.out.println("튜너를 껐습니다.");
	}
	public void setAm(){
		amMode = true;
	}
	public void setFm(){
		amMode = false;
	}
	public void setFrequency(double frequency){
		this.frequency = frequency;
		System.out.println("주파수를 " + frequency + "로 조정합니다.");
	}
}
