package ch14;

import java.awt.*;

public class SleepExampel {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        for (int i=0; i <10; i++) {
            tk.beep();
            System.out.println("beep");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }
}
