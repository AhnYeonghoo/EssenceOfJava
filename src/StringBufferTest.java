import java.util.*;

public class StringBufferTest {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");

        String result = sb.toString();
        System.out.println(result);

        sb.insert(0, "hello");
        System.out.println(sb.toString());
        System.out.println(sb.substring(0, 4));

        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(week[3]);

        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i]);
        }

        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));
        System.out.println(pitches.remove("129"));

        ArrayList<String> al = new ArrayList<String>();

        String one = (String) pitches.get(0);
        String two = (String) pitches.get(1);
        System.out.println(one);
        System.out.println(two);

        String[] data = {"131", "132", "133"};
        ArrayList<String> pp = new ArrayList<String>(Arrays.asList(data));
        System.out.println(pp);
        ArrayList<String> pp2 = new ArrayList<>(Arrays.asList("138", "139", "140"));
        System.out.println(pp2);

        ArrayList<String> com = new ArrayList<>(Arrays.asList("11", "22", "33"));
        System.out.println(com);
        String result2 = String.join(",", com);
        System.out.println(result2);

        String[] string = new String[]{"138", "129", "142"};
        String result3 = String.join(",", string);
        System.out.println(result3);
        com.sort(Comparator.reverseOrder());
        System.out.println(com);

        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
        System.out.println(map.getOrDefault("java", "자바"));
        System.out.println(map.containsKey("people"));
        System.out.println(map.remove("people"));
        System.out.println(map);
        System.out.println(map.size());
        map.put("people", "사람");
        System.out.println(map.keySet());

        HashSet<String> set = new HashSet<>(Arrays.asList("h", "e", "l" ));
        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2,3 ,4 ,5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract);

        HashSet<String> set2 = new HashSet<>();
        set2.add("Jump");
        set2.addAll(Arrays.asList("TO", "Java"));
        System.out.println(set2);

        set2.remove("TO");
        System.out.println(set2);

        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);

        for (CoffeeType copy : CoffeeType.values()) {
            System.out.println(copy);
        }

        String num = "123";

        int n = Integer.parseInt(num);
        System.out.println(n);

        System.out.println(StringBufferTest.getString());
    }

    static String getString() {
        return "Hello World";
    }
}

enum CoffeeType {
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
};

