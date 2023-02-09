package ch8;

public interface RemoteControl {

    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;
    public void turnOn();
    public void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
        }
    }

    static void changeBattery() {
        System.out.println("리모콘 건전지를 교체합니다.");
    }
}
