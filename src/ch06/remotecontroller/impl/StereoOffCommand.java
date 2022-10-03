package ch06.remotecontroller.impl;

import ch06.external.Stereo;
import ch06.remotecontroller.Command;

public class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo){
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.turnOff();
	}
}
