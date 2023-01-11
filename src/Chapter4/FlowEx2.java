package Chapter4;
import java.util.*;
public class FlowEx2 {
    public static void main(String[] args) {

        int input;
        System.out.print("input a number");

        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        input = Integer.parseInt(temp);
        if (input == 0) {
            System.out.println("number is zero");
        }
        if (input != 0) {
            System.out.println("number is not zero");
            System.out.printf("number is %d %n", input);
        }
}
}


