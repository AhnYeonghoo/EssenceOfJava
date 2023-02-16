package ch14;

public class WorkObject {
    public synchronized void methodA() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
        }
    }

    public synchronized void methodB() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " : methodB");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();

        ThreadA tA = new ThreadA(workObject);
        ThreadB tB = new ThreadB(workObject);

        tA.start();
        tB.start();
    }
}

class ThreadA extends Thread {

    private WorkObject workObject;

    public ThreadA(WorkObject workObject) {
        setName("THreadA");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread {
    private WorkObject workObject;

    public ThreadB(WorkObject workObject) {
        setName("THreadB");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}

