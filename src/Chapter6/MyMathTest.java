package Chapter6;

public class MyMathTest {

    public static void main(String[] args) {
        System.out.println("Main start");
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        firstMethod();
        System.out.println("Main End");
    }

    static void firstMethod() {
        System.out.println("firstMethod Start");
        secondMethod();
        System.out.println("firstMethod End");
    }

    static void secondMethod() {
        System.out.println("secondMethod Start");
        System.out.println("secondMethod");
        System.out.println("secondMethod End");

    }

}

class MyMath {
    long add(long a, long b) { return a + b; }


    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) { return a / b; }


}
