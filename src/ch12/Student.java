package ch12;

import java.util.HashSet;

public class Student {

    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student s) {
            if (no == s.getNo() && name.equals(s.getName())) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("동등 객체");
            } else {
                System.out.println("노동등");
            }
        } else {
            System.out.println("해시코드가 다름");
        }

        HashSet hs = new HashSet();

        Student s3 = new Student(1, "홍길동");
        hs.add(s3);
        System.out.println(hs.size());
        hs.add(s1);
        hs.add(s2);
        System.out.println(hs.size());
    }
}
