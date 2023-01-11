package Chapter7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // 자손 타입으로 조상타입으로 형변환 -> 업캐스팅
        // car.water(); -> Error
        fe2 = (FireEngine)car; // 조상 타입이 자손 타입으로 변환 -> 다운 캐스팅
        fe2.water();
        Car car2 = new Car();
        car.drive();
        fe = (FireEngine)car;
        fe.drive();
        car2 = fe;
        car2.drive();

    }
}
class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }
    void stop() {
        System.out.println("stop");
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}
