package ch9.sec03;

public class A {

    static class B {

    }

    B field1 = new B();

    static B field2 = new B();

    A() {
        B b = new B();
    }

    void method1() {
        B b = new B();
    }
    static void method2() {
        B b = new B();
    }

    public static void main(String[] args) {
        A.B b = new A.B();
    }
}