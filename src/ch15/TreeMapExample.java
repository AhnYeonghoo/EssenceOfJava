package ch15;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", 10);
        treeMap.put("forever", 60);
        treeMap.put("description", 40);
        treeMap.put("ever", 50);
        treeMap.put("zoo", 80);
        treeMap.put("buse", 20);
        treeMap.put("guess", 70);
        treeMap.put("cherry", 30);

        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() +  "-" + entry.getValue());
        }
        System.out.println();

        Map.Entry<String, Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞단어: " + entry.getKey() + " - " + entry.getValue());
        entry = treeMap.lastEntry();
        System.out.println(entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lowerEntry("ever");
        System.out.println(entry.getKey() + "-" + entry.getValue());
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        Set<Map.Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
        for (Map.Entry<String, Integer> e : descendingEntrySet) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println();
        System.out.println("[c-h] 사이의 단어 검색");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c",true,"h", false );
        for (Map.Entry<String, Integer> e : rangeMap.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }


    }
}
