package Ch6;

public class ProtectedCar {

    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) this.speed = 0;
    }

    public static void main(String[] args) {
        ProtectedCar car = new ProtectedCar();
        car.setSpeed(-50);
        System.out.println(car.speed);
        car.setSpeed(100);
        System.out.println(car.speed);

        if (!car.isStop()) {
            car.setStop(true);
        }
        System.out.println(car.speed);
    }
}
