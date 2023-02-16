package ch14;

public class InterrupExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {

        }
        thread.interrupt();
    }
}
