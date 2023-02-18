package ch15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime;
        long endtime;

        startTime = System.nanoTime();
        for (int i =0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endtime = System.nanoTime();
        System.out.println(endtime-startTime);

        System.out.println();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endtime = System.nanoTime();
        System.out.println(endtime-startTime);
    }
}
