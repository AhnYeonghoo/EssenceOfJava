package Ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;
        System.out.print("숫자를 하나 입력하세요.>");
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        input = Integer.parseInt(temp);
        if (input == 0) {
            System.out.println("0입니다. ");
        }
        if (input != 0 ) {
            System.out.println("0이 아니라");
            System.out.printf("%d입니다.", input);
        }
    }
}
