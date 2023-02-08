package Ch6;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저", "껌정", 250);

        System.out.println(myCar.model);
        System.out.println(myCar.company);
        System.out.println(myCar.speed);
        System.out.println(myCar.maxSpeed);
        System.out.println(myCar.color);
        myCar.speed = 60;
        System.out.println(myCar.speed);

        Car car2 = new Car("자가용");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        Car car4 = new Car("택시", "검정", 200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);

    }
}
