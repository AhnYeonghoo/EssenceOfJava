package ch7;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println(person.name);
        person.walk();

        if (person instanceof Student student) {
            student.study();
        }
    }



    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("홍길딩", 10);
        personInfo(p2);

    }
}

class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("걷습니다");
    }

}

class Student extends Person {
    public int studentNo;

    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    public void study() {
        System.out.println("공부를 합니다.");
    }
}
