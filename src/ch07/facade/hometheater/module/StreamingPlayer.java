package ch07.facade.hometheater.module;

public class StreamingPlayer {
	Amplifier amplifier;
	boolean surroundAudioMode;

	public StreamingPlayer(Amplifier amplifier){
		this.amplifier = amplifier;
		surroundAudioMode = false;
	}

	public void on(){
		System.out.println("스트리밍 플레이어를 켭니다.");
	}
	public void off(){
		System.out.println("스트리밍 플레이어를 끕니다.");
	}
	public void play(String movie){
		System.out.println("스트리밍 플레이어가 '" + movie + "' 를 재생합니다.");
	}
	public void pause(){
		System.out.println("스트리밍 플레이어를 정지합니다.");
	}
	public void setSurroundAudio(){
		surroundAudioMode = true;
		System.out.println("스트리밍 플레이어를 '서라운드 모드' 로 전환합니다.");
	}
	public void setTowChannelAudio(){
		surroundAudioMode = false;
		System.out.println("스트리밍 플레이어를 '2 채널 모드' 로 전환합니다.");
	}
	public void stop(){
		System.out.println("스트리밍 플레이어를 정지합니다.");
	}
}
