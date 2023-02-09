package ch7;

public class Parent {

    public String field1;

    public void method1() {
        System.out.println("Parent method1()");
    }

    public void method2() {
        System.out.println("Parent-method2()");
    }

    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();

        Parent p = new Child();

        p.field1 = "data1";
        p.method1();
        p.method2();


        Child c = (Child) p;
        c.field2 = "Data";
        c.method3();

    }
}

class Child extends Parent {

    public String field2;
    @Override
    public void method2() {
        System.out.println("CHild-method2()");
    }

    public void method3() {
        System.out.println("CHild-method3()");
    }

}