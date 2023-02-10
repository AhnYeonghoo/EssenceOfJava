package ch8;

public class Car {

    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }

    public static void main(String[] args) {

        Car c = new Car();
        c.run();

    }
}
