package ch06.remotecontroller.command.impl;

import ch06.external.Stereo;
import ch06.remotecontroller.Command;

public class StereoOnCommand implements Command {
	Stereo stereo;

	public StereoOnCommand(Stereo stereo){
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.turnOn();
		stereo.setCD();
		stereo.setMusic();
		stereo.setVolume(10);
	}

	@Override
	public void undo(){
		stereo.turnOff();
	}
}
