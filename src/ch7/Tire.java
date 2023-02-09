package ch7;

public class Tire {
    public void roll() {
        System.out.println("회전합니다.");
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.tire = new Tire();
        c.run();

        c.tire = new HankookTire();
        c.run();

        c.tire = new KumhoTire();
        c.run();
    }
}

class HankookTire extends Tire {
    @Override
    public void roll() {
        System.out.println("한국타이어");
    }
}

class KumhoTire extends Tire {
    @Override
    public void roll() {
        System.out.println("금호타이어");
    }
}

class Car {
    public Tire tire;

    public void run() {
        tire.roll();
    }
}
