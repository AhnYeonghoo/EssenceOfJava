package ch12;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {

        Integer obj = 100;
        System.out.println(obj.intValue());

        int value = obj;
        System.out.println(value);

        int result = obj + 100;
        System.out.println(result);

        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println();

        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println(obj3 == obj4);
        System.out.println(obj3.equals(obj4));
    }
}
