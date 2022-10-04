package ch06;

import ch06.external.GarageDoor;
import ch06.external.Light;
import ch06.external.LivingRoom;
import ch06.external.Stereo;
import ch06.remotecontroller.RemoteControl;
import ch06.remotecontroller.impl.StereoOffCommand;
import ch06.remotecontroller.impl.StereoOnCommand;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LivingRoom livingRoom = new LivingRoom();
		Stereo stereo = new Stereo();

		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remote.setCommand(0, light::on, light::off);
		remote.setCommand(1, livingRoom::on, livingRoom::off);
		remote.setCommand(2, garageDoor::up, garageDoor::down);
		remote.setCommand(3, stereoOn, stereoOff);

		System.out.println(remote);

		remote.onButtonWasPressed(0);
		remote.onButtonWasPressed(1);
		remote.onButtonWasPressed(2);
		remote.onButtonWasPressed(3);

		remote.offButtonWasPressed(0);
		remote.offButtonWasPressed(1);
		remote.offButtonWasPressed(2);
		remote.offButtonWasPressed(3);
	}

}
