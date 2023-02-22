package ch17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {

        int[] intArray = {1, 2,3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(d -> System.out.println(d));
        System.out.println();


        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(obj -> System.out.println(obj.intValue()));
    }
}
