package ch06;

import ch06.external.GarageDoor;
import ch06.external.Light;
import ch06.external.LivingRoom;
import ch06.external.Stereo;
import ch06.remotecontroller.SimpleRemoteControl;
import ch06.remotecontroller.impl.GarageDoorCloseCommand;
import ch06.remotecontroller.impl.GarageDoorOpenCommand;
import ch06.remotecontroller.impl.LightOffCommand;
import ch06.remotecontroller.impl.LightOnCommand;
import ch06.remotecontroller.impl.StereoOffCommand;
import ch06.remotecontroller.impl.StereoOnCommand;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LivingRoom livingRoom = new LivingRoom();
		Stereo stereo = new Stereo();

		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		LightOnCommand livingRoomOn = new LightOnCommand(livingRoom);
		LightOffCommand livingRoomOff = new LightOffCommand(livingRoom);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remote.setCommand(lightOn);
		remote.setCommand(lightOff);
		remote.setCommand(livingRoomOn);
		remote.setCommand(livingRoomOff);
		remote.setCommand(garageOpen);
		remote.setCommand(garageClose);
		remote.setCommand(stereoOn);
		remote.setCommand(stereoOff);

		remote.buttonWasPressed(0);
		remote.buttonWasPressed(1);
		remote.buttonWasPressed(2);
		remote.buttonWasPressed(3);
		remote.buttonWasPressed(4);
		remote.buttonWasPressed(5);
		remote.buttonWasPressed(6);
		remote.buttonWasPressed(7);
	}

}
