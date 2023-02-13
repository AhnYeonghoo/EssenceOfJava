package ch12;

import java.io.IOException;

public class ErrExample {
    public static void main(String[] args) throws IOException {
        try {
            int value = Integer.parseInt("1oo");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        int speed = 0;
        int keyCode = 0;

        while (true) {
            if (keyCode != 13 && keyCode != 10) {
                if (keyCode == 49) {
                    speed++;
                } else if (keyCode == 50) {
                    speed--;
                } else if (keyCode == 51) {
                    break;
                }
                System.out.println("--------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("---------------");
                System.out.println("현재속도 = " + speed);
                System.out.println("선택: ");
            }

            keyCode = System.in.read();
        }
        System.out.println("프로그램 종료");
    }
}
