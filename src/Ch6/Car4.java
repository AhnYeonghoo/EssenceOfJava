package Ch6;

public class Car4 {

    String model;
    int speed;
    Car4(String model) {
        this.model = model;
    }
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "이 달립니다.  시속: " + this.speed);
    }
}
