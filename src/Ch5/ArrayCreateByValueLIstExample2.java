package Ch5;

public class ArrayCreateByValueLIstExample2 {
    public static void main(String[] args) {
        int[] score;

        score = new int[] {83, 90, 87};
        int sum = 0;
        for (int i=0; i<3; i++) {
            sum += score[i];
        }
        System.out.println(sum);

        printItem(new int[] {83, 92, 87});
    }
    public static void printItem(int[] score) {
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]:  " + score[i]);

        }
    }
}
