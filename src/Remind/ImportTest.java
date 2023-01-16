package Remind;

import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.Math.*;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
        System.out.println(date.format(today));
        System.out.println(time.format(today));
        out.println(random());

    }
}
