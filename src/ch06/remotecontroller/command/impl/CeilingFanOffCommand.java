package ch06.remotecontroller.command.impl;

import ch06.external.CeilingFan;
import ch06.remotecontroller.command.CeilingFanCommand;

public class CeilingFanOffCommand extends CeilingFanCommand {

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}
}
