package ch15;

import java.util.TreeSet;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<Person>();

        ts.add(new Person("hong", 45));
        ts.add(new Person("kim", 25));
        ts.add(new Person("park", 31));
        for (Person person : ts) {
            System.out.println(person.name + ":" + person.age);
        }
    }


}
