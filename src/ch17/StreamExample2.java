package ch17;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {
    public static int sum;
    public static void main(String[] args) {
        String[] strArray = {"홍", "신", "김"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.println(item+","));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.println(item+","));
        System.out.println();


        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);
        System.out.println(sum);
    }
}
