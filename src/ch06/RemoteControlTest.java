package ch06;

import ch06.external.CeilingFan;
import ch06.external.GarageDoor;
import ch06.external.Light;
import ch06.external.LivingRoom;
import ch06.external.Stereo;
import ch06.remotecontroller.Command;
import ch06.remotecontroller.RemoteControl;
import ch06.remotecontroller.command.impl.CeilingFanHighCommand;
import ch06.remotecontroller.command.impl.CeilingFanLowCommand;
import ch06.remotecontroller.command.impl.CeilingFanMediumCommand;
import ch06.remotecontroller.command.impl.CeilingFanOffCommand;
import ch06.remotecontroller.command.impl.GarageDoorCloseCommand;
import ch06.remotecontroller.command.impl.GarageDoorOpenCommand;
import ch06.remotecontroller.command.impl.LightOffCommand;
import ch06.remotecontroller.command.impl.LightOnCommand;
import ch06.remotecontroller.command.impl.MacroCommand;
import ch06.remotecontroller.command.impl.StereoOffCommand;
import ch06.remotecontroller.command.impl.StereoOnCommand;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LivingRoom livingRoom = new LivingRoom();
		Stereo stereo = new Stereo();
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		LightOnCommand livingOn = new LightOnCommand(livingRoom);
		LightOffCommand livingOff = new LightOffCommand(livingRoom);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		Command[] partyOn = {lightOn, stereoOn, garageOpen, ceilingFanLow};
		Command[] partyOff = {lightOff, stereoOff, garageClose, ceilingFanOff};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, livingOn, livingOff);
		remote.setCommand(2, garageOpen, garageClose);
		remote.setCommand(3, stereoOn, stereoOff);
		remote.setCommand(4, ceilingFanHigh, ceilingFanMedium);
		remote.setCommand(5, ceilingFanLow, ceilingFanOff);
		remote.setCommand(6, partyOnMacro, partyOffMacro);

		System.out.println(remote);

		remote.onButtonWasPressed(0);
		remote.onButtonWasPressed(1);
		remote.onButtonWasPressed(2);
		remote.onButtonWasPressed(3);
		remote.onButtonWasPressed(4);
		remote.onButtonWasPressed(5);

		remote.undoButtonWasPressed();

		remote.offButtonWasPressed(0);
		remote.offButtonWasPressed(1);
		remote.offButtonWasPressed(2);
		remote.offButtonWasPressed(3);
		remote.offButtonWasPressed(4);
		remote.offButtonWasPressed(5);

		System.out.println("\n--- 파티 매크로 버튼 눌림 ---");
		remote.onButtonWasPressed(6);
		remote.offButtonWasPressed(6);
		remote.undoButtonWasPressed();
	}

}
