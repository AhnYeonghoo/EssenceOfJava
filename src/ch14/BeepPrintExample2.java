package ch14;

import javax.tools.Tool;
import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit tk = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    tk.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        });
        thread.start();
        for (int i =0;i <5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) { }
        }
    }
}

