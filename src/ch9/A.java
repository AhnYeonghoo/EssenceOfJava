package ch9;

public class A {

    class B {
        int field = 1;

        static int field2 = 2;

        B() {
            System.out.println("B Constructor");
        }

        void method1() {
            System.out.println("B-method1");
        }

        static void method2() {
            System.out.println("static method2");
        }


    }
    void useB() {
        B b = new B();
        System.out.println(b.field);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }

    B field = new B();

    A() {
        B b = new B();
    }

    void method() {
        B b = new B();
    }

    public static void main(String[] args) {

        A a = new A();
        a.useB();

    }
}
