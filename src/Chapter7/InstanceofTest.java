package Chapter7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine3 fe = new FireEngine3();
        if (fe instanceof FireEngine3) {
            System.out.println("this is a FireEngine Instance");
        }
        if (fe instanceof Car3) {
            System.out.println("this is Car Instance");
        }
        if (fe instanceof Object) {
            System.out.println("this is an Object Instance");
        }
        System.out.println(fe.getClass().getName());
    }
}

class Car3 {}
class FireEngine3 extends Car3{}

