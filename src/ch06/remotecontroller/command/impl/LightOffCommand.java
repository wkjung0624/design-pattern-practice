package ch06.remotecontroller.command.impl;

import ch06.external.Light;
import ch06.remotecontroller.Command;

public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
	@Override
	public void undo(){
		light.on();
	}
}
