package ch12;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.println("선택번호: ");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.println(selectNumber[i]);
        }
        System.out.println();

        int[] winningNumber = new int[6];
        random = new Random(5);
        for (int i=0; i<6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.println(winningNumber[i]);
        }
        System.out.println();

        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.println("당첨여부: ");
        if (result) System.out.println("1등");
        else System.out.println("꽝");
    }

}
