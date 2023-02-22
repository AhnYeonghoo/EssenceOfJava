package ch17;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParalleStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("람다식");
        list.add("박병렬");
        Stream<String> paralleStream = list.parallelStream();
        paralleStream.forEach(name -> {
            System.out.println(name+ ": " + Thread.currentThread().getName());
        });
    }
}
