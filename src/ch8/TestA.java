package ch8;

public sealed interface TestA permits TestB {

    void methodA();
}

non-sealed interface TestB extends TestA {
    void methodB();
}

interface TestC extends TestB {
    void methodC();
}

class ImplClass implements TestC {

    @Override
    public void methodA() {
        System.out.println("MethodA");
    }

    @Override
    public void methodB(){
        System.out.println("MethodB");
    }

    @Override
    public void methodC() {
        System.out.println("MethodC");
    }

    public static void main(String[] args) {
        ImplClass impl = new ImplClass();

        TestA a = impl;
        a.methodA();
        System.out.println();

        TestB b = impl;
        b.methodA();
        b.methodB();

        System.out.println();

        TestC c = impl;
        c.methodA();
        c.methodC();
        c.methodB();
    }

}
