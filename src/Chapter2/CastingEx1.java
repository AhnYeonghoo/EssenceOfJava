package Chapter2;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.println("score="+score);
        System.out.println("d="+d);

        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i , b);
        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i ,b);

        b = 10;
        i = (int)b;
        System.out.printf("[byte->int] b=%d -> i=%d%n", b, i);

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
        System.out.println("i="+Integer.toBinaryString(i));

        float f = 9.1234567f;
        double dd = 9.1234567;
        double d2 = (double)f;
        System.out.printf("f = %20.18f%n", f);
        System.out.printf("d=%20.18f%n",dd);
        System.out.printf("d2=%20.18f%n",d2);
    }
}
