package ch14;

public class SafeStopExample  {
    public static void main(String[] args) {
        PrintThread pt = new PrintThread();
        pt.start();

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) { }
        pt.setStop(true);
    }
}
