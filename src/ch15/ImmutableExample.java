package ch15;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList1 = List.of("a", "b", "c");

        Set<String> ImmutableSet1 = Set.of("a", "b", "c");

        Map<Integer, String> immutableMap1 = Map.of(
                1, "a",
                2, "b",
                3, "c"
        );

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> immutableList2 = List.copyOf(list);

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        Set<String> immutableSet2 = Set.copyOf(set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        String[] arr = {"a", "b", "c"};
        List<String> immutableList3 = Arrays.asList(arr);
    }
}
