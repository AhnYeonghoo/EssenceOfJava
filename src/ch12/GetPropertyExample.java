package ch12;

import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name" ));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperties().keySet());
        Set keys = System.getProperties().keySet();
        for (Object obj : keys) {
            String key = (String) obj;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }

    }
}
