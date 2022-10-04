package ch06.remotecontroller.command;

import ch06.external.CeilingFan;
import ch06.remotecontroller.Command;

public abstract class CeilingFanCommand implements Command {
	public CeilingFan ceilingFan;
	public int prevSpeed;

	protected CeilingFanCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.SPEED_HIGH) {
			ceilingFan.high();
		} else if(prevSpeed == CeilingFan.SPEED_MEDIUM) {
			ceilingFan.medium();
		} else if(prevSpeed == CeilingFan.SPEED_LOW) {
			ceilingFan.low();
		} else if(prevSpeed == CeilingFan.SPEED_OFF) {
			ceilingFan.off();
		}
	}
}
