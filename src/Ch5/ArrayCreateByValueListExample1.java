package Ch5;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "summer", "Fall", "Winter"};

        System.out.println(season[0]);
        System.out.println(season[1]);
        System.out.println(season[2]);
        System.out.println(season[3]);

        season[1] = "여름";
        System.out.println(season[1]);
        System.out.println();

        int[] score = {83, 90, 87};
        int sum= 0;
        for (int i = 0; i <3;i++){
            sum+=score[i];
        }
        System.out.println(sum);
        double avg = (double)sum/3;
        System.out.println(avg);
    }
}
