package ch06.remotecontroller;

import ch06.remotecontroller.command.impl.NoCommand;

public class RemoteControl {
	Command[] onCommand;
	Command[] offCommand;
	Command undoCommand;

	public RemoteControl() {
		onCommand = new Command[7];
		offCommand = new Command[7];

		Command noCommand = new NoCommand();

		for(int i = 0; i < onCommand.length; i++){
			onCommand[i] = noCommand;
			offCommand[i] = noCommand;
		}

		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommand[slot] = onCommand;
		this.offCommand[slot] = offCommand;
	}
	public void onButtonWasPressed(int slot) {
		onCommand[slot].execute();
		undoCommand = onCommand[slot];
	}
	public void offButtonWasPressed(int slot) {
		offCommand[slot].execute();
		undoCommand = offCommand[slot];
	}
	public void undoButtonWasPressed() {
		System.out.println("\n--- 되돌리기 버튼 눌림 ---");
		undoCommand.undo();
		System.out.println("-------------------\n");
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
