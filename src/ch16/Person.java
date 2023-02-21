package ch16;

public class Person {
    public void action(Workable workable) {
        workable.work();
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.action(() -> {
            System.out.println("출근");
        });
        person.action(() -> System.out.println("하이"));
    }
}
