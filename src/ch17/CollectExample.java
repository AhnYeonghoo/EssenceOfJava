package ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 92));
        totalList.add(new Student("김자바", "남", 92));
        totalList.add(new Student("오해영", "여", 92));

        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();
        maleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );
        System.out.println(map);

    }
}
