package ch14;

public class PrintThread extends Thread {
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        try {
            while (!stop) {
                System.out.println("실행중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("리소스 정리");
            System.out.println("실행 종료");
        }
    }
}
