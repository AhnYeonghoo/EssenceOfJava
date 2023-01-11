package Chapter6;

public class MyMath2 {
    public static void main(String[] args) {
        System.out.println(MyMathTest2.add(200L, 100L));
        System.out.println(MyMathTest2.subtract(200L, 100L));
        System.out.println(MyMathTest2.multiply(200L, 100L));
        System.out.println(MyMathTest2.divide(200.0, 100.0));

        MyMathTest2 MM = new MyMathTest2();
        MM.a = 200L;
        MM.b = 100L;
        System.out.println(MM.add());
        System.out.println(MM.subtract());
        System.out.println(MM.multiply());
        System.out.println(MM.divide());
    }
}

class MyMathTest2 {
    long a, b;

    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a / b; }

    static long add(long a, long b) { return a + b; }
    static long subtract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
}
