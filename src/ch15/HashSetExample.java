package ch15;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("JDBC");
        set.add("jsp");
        set.add("java");
        set.add("Spring");
        int size = set.size();
        System.out.println(size);
    }
}
