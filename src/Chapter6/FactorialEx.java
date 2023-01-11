package Chapter6;

public class FactorialEx {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
        long result2 = 0;
        int n = 21;
        for (int i = 1; i <= n; i++) {
            result2 = improFactorial(i);
            if (result2 == 1) {
                System.out.printf("not valid value (0<n<=20) : %d%n", n);
                break;
            }
            System.out.printf("%2d!=%20d%n", i, result2);
        }
//        main(null);
    }

    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n-1);
        }
        return result;
    }

    static long improFactorial(int n) {
        if (n <= 0 || n > 20) return -1;
        if (n <= 1) return 1;
        return n * improFactorial(n-1);
    }
}
