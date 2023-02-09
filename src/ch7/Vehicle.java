package ch7;

public class Vehicle {

    public void run() {
        System.out.println("차량이 달립니다");
    }

    public static void main(String[] args) {
        Driver d = new Driver();

        Bus bus = new Bus();
        d.drive(bus);

        Taxi t = new Taxi();
        d.drive(t);
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다/");
    }
}

class Taxi extends Vehicle {

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

class Driver {
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}