package ch06.remotecontroller.impl;

import ch06.remotecontroller.Command;
import ch06.external.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
