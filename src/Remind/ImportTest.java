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

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog() {
        out.println("default constructor");
    }
    void sleep() {
        out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    HouseDog(String name) {
        this.setName(name);
    }

    HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }
    void sleep() {
        out.println(this.name + " zzz in hous");
    }

    void sleep(int hour) {
        out.println(this.name + " zzz in house for " + hour + " h");
    }
}

