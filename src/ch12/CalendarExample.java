package ch12;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strweek = null;

        switch(week) {
            case Calendar.MONDAY: strweek = "월"; break;
            case Calendar.TUESDAY: strweek = "화"; break;
            case Calendar.WEDNESDAY: strweek = "수"; break;
            case Calendar.THURSDAY: strweek = "목"; break;
            case Calendar.FRIDAY: strweek = "금"; break;
            case Calendar.SATURDAY: strweek = "토"; break;
            default: strweek = "일";
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if (amPm == Calendar.AM) {
            strAmPm = "오전";
        } else {
            strAmPm = "오후";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(strweek);
        System.out.println(strAmPm);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
    }
}
