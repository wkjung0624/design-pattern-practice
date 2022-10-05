package ch07.facade.hometheater;

import ch07.facade.hometheater.module.Amplifier;
import ch07.facade.hometheater.module.PopcornPopper;
import ch07.facade.hometheater.module.Projector;
import ch07.facade.hometheater.module.Screen;
import ch07.facade.hometheater.module.StreamingPlayer;
import ch07.facade.hometheater.module.TheaterLights;
import ch07.facade.hometheater.module.Tuner;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	StreamingPlayer player;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;

	public HomeTheaterFacade(Amplifier amp,
		Tuner tuner,
		StreamingPlayer player,
		Projector projector,
		Screen screen,
		TheaterLights lights,
		PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.player = player;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	public void watchMovie(String movie){
		System.out.println("영화 볼 준비 중");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setStreamingPlayer(player);
		amp.setSurroundSound();
		amp.setVolume(5);
		player.on();
		player.play(movie);
	}

	public void endMovie(){
		System.out.println("홈씨어터를 끄는 중입니다.");
		popper.off();
		lights.off();
		screen.up();
		projector.off();
		amp.off();
		player.stop();
		player.off();
	}
	public void listenToRadio(){

	}
	public void endRadio(){

	}
}
