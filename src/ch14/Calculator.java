package ch14;

public class Calculator {

    private int memory;
    public int getMemory() {
        return memory;
    }
    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " : " + this.memory);
        }
    }
    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " : " + this.memory);
            }
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1Thread u1 = new User1Thread();
        u1.setCalculator(calculator);
        u1.start();

        User2Thread u2 = new User2Thread();
        u2.setCalculator(calculator);
        u2.start();
    }

}

class User1Thread extends Thread {
    private Calculator calculator;

    public User1Thread() {
        setName("USer1Thread");
    }
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}

class User2Thread extends Thread {
    private Calculator calculator;

    public User2Thread() {
        setName("User2Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }
}