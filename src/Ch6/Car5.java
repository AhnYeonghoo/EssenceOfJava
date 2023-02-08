package Ch6;

public class Car5 {
    int speed;
    void run() {
        System.out.println(speed + " 로 달립니다.");
    }

    static void simulate() {
        Car5 myCar = new Car5();
        myCar.speed = 200;
        myCar.run();
    }
    public static void main(String[] args) {
        simulate();
        Car5 myCar = new Car5();
        myCar.speed = 60;
        myCar.run();
    }
}

