package ch06.remotecontroller;

import ch06.remotecontroller.impl.NoCommand;

public class RemoteControl {
	Command[] onCommand;
	Command[] offCommand;

	public RemoteControl() {
		onCommand = new Command[7];
		offCommand = new Command[7];

		Command noCommand = new NoCommand();
		for(int i = 0; i < onCommand.length; i++){
			onCommand[i] = noCommand;
			offCommand[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommand[slot] = onCommand;
		this.offCommand[slot] = offCommand;
	}
	public void onButtonWasPressed(int slot) {
		onCommand[slot].execute();
	}
	public void offButtonWasPressed(int slot) {
		offCommand[slot].execute();
	}

	@Override
	public String toString(){
		StringBuffer result = new StringBuffer();

		result.append("--------- 리모컨 슬롯 정보 ---------\n");
		for(int i = 0; i < onCommand.length; i++){
			result.append("["+ i + "번 슬롯] " + onCommand[i].getClass().getSimpleName() + ", " + offCommand[i].getClass().getSimpleName() + "\n");
		}
		result.append("--------------------------------");
		return result.toString();
	}
}
