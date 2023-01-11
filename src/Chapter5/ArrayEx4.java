package Chapter5;

public class ArrayEx4 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0.0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int temp : score) {
            sum += temp;
        }

        average = (float)sum / score.length;
        System.out.println("sum: "+ sum);
        System.out.println("average: " + average);
    }
}
