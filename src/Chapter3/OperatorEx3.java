package Chapter3;
import java.util.*;

public class OperatorEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        System.out.printf("input a char>");
        String input = scanner.nextLine();
        ch = input.charAt(0);
        if ('0' <= ch && ch <= '9') {
            System.out.printf("this is number");
        } else if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("this is English");
        }
    }
}
