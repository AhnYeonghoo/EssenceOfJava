package Chapter3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;
        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i);

        int a = 10;
        int b = 4;
        System.out.printf("%d + %d = %d%n", a, b, a+b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %d %n", a, b, a/b);
        System.out.printf("%d / %f - %f%n",a,(float)b, a/(float)b);

        byte a2 = 10;
        byte b2 = 30;
        byte c = (byte)(a2*b2);
        System.out.println(c);

        int a3 = 1_000_000;
        int b3 = 2_000_000;
        long c3  = a3 * b3;
        System.out.println(c3);

    }
}
