package Chapter4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        int num = 0,  sum = 0;
        System.out.print("input number (eg:12345) >");
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        num = Integer.parseInt(temp);

        while (num!=0) {
            sum += num%10;
            System.out.printf("sum=%3d, num=%d%n", sum, sum);
            num /= 10;
        }
        System.out.println("sum="+sum);
    }
}
