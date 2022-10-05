package ch07.facade;

import ch07.facade.hometheater.HomeTheaterFacade;
import ch07.facade.hometheater.module.Amplifier;
import ch07.facade.hometheater.module.PopcornPopper;
import ch07.facade.hometheater.module.Projector;
import ch07.facade.hometheater.module.Screen;
import ch07.facade.hometheater.module.StreamingPlayer;
import ch07.facade.hometheater.module.TheaterLights;
import ch07.facade.hometheater.module.Tuner;

public class FacadeTest {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner(amp);
		StreamingPlayer player = new StreamingPlayer(amp);
		Projector projector = new Projector(player);
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		PopcornPopper popper = new PopcornPopper();

		HomeTheaterFacade homeTheaterFacade =
			new HomeTheaterFacade(amp, tuner, player,
				projector, screen, lights, popper);

		homeTheaterFacade.watchMovie("인디아나 존스");
		homeTheaterFacade.endMovie();
	}
}
