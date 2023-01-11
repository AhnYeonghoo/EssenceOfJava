package Chapter4;
import java.util.*;
public class FlowEx3 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("input the score> ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade='C';
        } else {
            grade='D';
        }
        System.out.println("your grade is " +grade+" ");
    }
}
