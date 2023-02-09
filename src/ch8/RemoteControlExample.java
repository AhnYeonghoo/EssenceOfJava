package ch8;

import java.rmi.Remote;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        RemoteControl ac = new Audio();
        ac.turnOn();
        ac.setVolume(10);
        ac.turnOff();
        ac.setMute(true);
        ac.setMute(false);
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        RemoteControl.changeBattery();
    }
}
