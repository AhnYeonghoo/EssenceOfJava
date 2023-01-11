package Chapter4;

import java.util.*;

public class FlowEx7 {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scan = new Scanner(System.in);

        outer:
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("check the menu (exit:0) >");

            String temp = scan.nextLine();
            menu = Integer.parseInt(temp);
            if (menu == 0) {
                System.out.println("exit program ");
                break;
            } else if (!(1<=menu && menu <=3)) {
                System.out.println("not menu");
                continue;
            }

            for (;;) {
                System.out.print("sum value input");
                temp = scan.nextLine();
                num = Integer.parseInt(temp);

                if (num == 0) break;
                if (num == 999) break outer;

                switch(menu) {
                    case 1:
                        System.out.println("result="+num*num);
                        break;
                    case 2:
                        System.out.println("result="+Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result="+Math.log(num));
                        break;
                }
            }
        }

    }
}
