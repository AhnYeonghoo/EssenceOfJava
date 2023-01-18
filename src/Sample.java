public class Sample {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));

        Calculator3 cal1 = new Calculator3();
        Calculator3 cal2 = new Calculator3();
        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));
        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));

        Animal cat = new Animal();
        Animal dog = new Animal();
        dog.setName("dog");
        cat.setName("body");
        System.out.println(cat.name);
        System.out.println(dog.name);
        Sample sample = new Sample();
        sample.sayNick("fool");
        sample.sayNick("foodd");
    }

    void sayNick(String nick) {
        if ("fool".equals(nick)) return;
        System.out.println("나의 별명은 " + nick + " 입니다.");
    }

}

class Calculator1 {
    static int result = 0;
    static int add(int num) {
        result += num;
        return result;
    }
}

class Calculator3 {
    int result = 0;
    int add(int num) {
        result += num;
        return result;
    }
    int sub(int num) {
        result -= num;
        return result;
    }
}

class Calculator {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}


class Animal {
    String name;
    public void setName(String name) {
        this.name = name;
    }
}