package Chapter6;

class Data { int x; }

class ReferData { int x; }
public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        ReferData dd = new ReferData();
        d.x = 10;
        System.out.println("Main(): x = " + d.x);
        change(d.x);
        System.out.println("after change(d.x)");
        System.out.println(d.x);
        dd.x = 10;
        System.out.println(dd.x);
        ReferChange(dd);
        System.out.println(dd.x);


    }

    static void change(int x) {
        x = 1000;
        System.out.println("Change(): x = "+x);
    }

    static void ReferChange(ReferData d) {
        d.x = 1000;
        System.out.println("ReferChange(): x = "+ d.x);
    }
}
