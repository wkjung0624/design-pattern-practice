package ch06.remotecontroller;

import java.util.ArrayList;
import java.util.List;

public class SimpleRemoteControl {
	List<Command> slots;
	public SimpleRemoteControl() {
		slots = new ArrayList<>();
	}

	public void setCommand(Command command) {
		slots.add(command);
	}
	public void buttonWasPressed(int buttonIdx) {
		slots.get(buttonIdx).execute();
	}
}
