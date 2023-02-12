package ch9;

public class Tire {

    public void roll() {
        System.out.println("일반 타이어");
    }

}

class Car {
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire");
        }
    };

    public void run1() {
        tire1.roll(

        );
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire2");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.run1();
        car.run2();
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 tire3");
            }
        });


    }
}
