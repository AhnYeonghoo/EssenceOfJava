package ch8;

public class Taxi implements Vehicle {

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }

    public static void main(String[] args) {
        Driver d = new Driver();

        Bus b = new Bus();
        Taxi t = new Taxi();

        d.drive(b);
        d.drive(t);
    }
}
