package ch06.remotecontroller.impl;

import ch06.remotecontroller.Command;
import ch06.external.GarageDoor;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.up();
	}
}
