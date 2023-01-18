package Remind;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        car = fe;
        fe.water();
        fe2 = (FireEngine)car;
        fe2.water();
        fe2.drive();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Drive");
    }
    void stop() {
        System.out.println("Stop");
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("Water");
    }
}