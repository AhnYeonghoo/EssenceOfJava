package Remind;

//import javax.xml.crypto.Data;
import java.util.Date;

public class ReFerenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);
        change(d);
        System.out.println(d.x);
        int[] x = {10};
        System.out.println(x[0]);
        change2(x);
        System.out.println(x[0]);
    }

    static void change(Data d) {
        d.x = 1000;
        System.out.println("change");
    }

    static void change2(int[] x) {
        x[0] = 1000;
    }

    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }

}

class Data {
    int x;
}
