package ch17;

import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int score;
    private String sex;

    public Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);

    }
}



