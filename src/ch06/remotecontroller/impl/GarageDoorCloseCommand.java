package ch06.remotecontroller.impl;

import ch06.external.GarageDoor;
import ch06.remotecontroller.Command;

public class GarageDoorCloseCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorCloseCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.down();
	}
}
