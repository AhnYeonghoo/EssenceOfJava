package ch12;

import java.sql.Time;
import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        String[] a = TimeZone.getAvailableIDs();
        for (String id : a) {
            System.out.println(id);
        }

    }
}
