package ch8;

public class ExtendsExample {

    public static void main(String[] args) {

        InterfaceImpl i = new InterfaceImpl();

        InterfaceA a = i;

        a.methodA();

        InterfaceB b = i;
        b.methodB();

        InterfaceC c = i;
        c.methodC();
        c.methodA();
        c.methodB();


    }
}
