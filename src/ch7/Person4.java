package ch7;

public sealed class Person4 permits Employee, Manager {

    public String name;

    public void walk() {
        System.out.println("하는일이 결정되지 않았다.");
    }

    public static void main(String[] args) {

        Person4 p = new Person4();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();
        p.walk();
        e.walk();
        m.walk();
        d.walk();
    }
}

final class Employee extends Person4 {
    @Override
    public void walk() {
        System.out.println("제품을 생산합니다");
    }
}

non-sealed class Manager extends Person4 {
    @Override
    public void walk() {
        System.out.println("생산 관리를 합니다.");
    }
}

class Director extends Manager {
    @Override
    public void walk() {
        System.out.println("제품을 기획합니다.");
    }
}
