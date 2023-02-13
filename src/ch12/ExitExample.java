package ch12;

public class ExitExample {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("process exit");
                System.exit(0);
            }
        }
    }
}
