package ch06.remotecontroller.command.impl;

import ch06.remotecontroller.Command;

public class NoCommand implements Command {
	@Override
	public void execute(){
		// NoCommand
	}

	@Override
	public void undo() {
		// NoCommand
	}
}
