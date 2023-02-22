package ch17;

import java.util.ArrayList;
import java.util.List;

public class Student2 {
    private String name;
    private int score;

    public Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name;}
    public int getScore() { return score; }

    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("홍길동", 85));
        list.add(new Student2("홍길동", 92));
        list.add(new Student2("홍길동", 87));

        list.stream()
                .mapToInt(s -> s.getScore())
                .forEach(s -> System.out.println(s));
    }
}
