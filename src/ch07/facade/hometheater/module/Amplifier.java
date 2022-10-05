package ch07.facade.hometheater.module;

public class Amplifier {

	Tuner tuner;
	StreamingPlayer player;
	boolean soundMode;
	int volume;

	public Amplifier(){
		volume = 10;
	}

	public void on(){
		System.out.println("앰프를 켰습니다.");
	}
	public void off(){
		System.out.println("앰프를 껐습니다.");
	}
	public void setStreamingPlayer(StreamingPlayer player){
		this.player = player;
		soundMode = false;
	}
	public void setStereoSound(){
		System.out.println("앰프 사운드를 '스테레오'로 변경하였습니다");
	}
	public void setSurroundSound(){
		System.out.println("앰프 사운드를 '서라운드'로 변경하였습니다");
	}
	public void setTuner(Tuner tuner){
		this.tuner = tuner;
	}
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("앰프 사운드를 " + volume + " 으로 조정하였습니다");
	}
}
