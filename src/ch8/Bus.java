package ch8;

public class Bus implements  Vehicle {

    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }

    public void checkFace() {
        System.out.println("요금 체크");
    }

    public static void main(String[] args) {
        Vehicle v = new Bus();
        v.run();

        Bus bus = (Bus) v;
        bus.run();
        bus.checkFace();
    }
}
