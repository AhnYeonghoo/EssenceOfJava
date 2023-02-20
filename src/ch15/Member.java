package ch15;

import java.util.HashSet;
import java.util.Set;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) & (target.age==age);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        System.out.println(set.size());
     }
}
