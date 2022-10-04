package ch06.remotecontroller.command.impl;

import ch06.external.CeilingFan;
import ch06.remotecontroller.command.CeilingFanCommand;

public class CeilingFanLowCommand extends CeilingFanCommand {

	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
	}
}
