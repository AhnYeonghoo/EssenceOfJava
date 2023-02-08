package Ch6;

public class StaticCalculator {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator2.pi;
        int result2 = Calculator2.plus(10 ,5);
        int result3 = Calculator2.minus(10, 5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

class Calculator2 {
    static double pi = 3.14159;

    static int plus(int x, int y) {
        return x + y;
    }
    static int minus(int x, int y) {
        return x - y;
    }
}
