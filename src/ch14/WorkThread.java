package ch14;

public class WorkThread extends Thread {
    public boolean work = true;

    public WorkThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + " 작업처리");
            } else {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {

        WorkThread A = new WorkThread("workThreadA");
        WorkThread B = new WorkThread("workThreadB");
        A.start();
        B.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        A.work = false;
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {}
        B.work = true;
    }

}
