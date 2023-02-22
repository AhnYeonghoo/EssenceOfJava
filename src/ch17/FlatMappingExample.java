package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("This Is Java");
        list1.add("I am a best devloper");
        list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(word -> System.out.println(word));

        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30" , "40, 50");
        list2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i< strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println(number));
    }
}
