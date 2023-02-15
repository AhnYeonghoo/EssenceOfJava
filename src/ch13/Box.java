package ch13;

public class Box<T> {
    public T content;

    private T t;

    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }

    public boolean compare(Box<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        box1.content = "1000";
        Box box2 = new Box();
        box2.content = "100";
        Box box3 = new Box();
        box3.content = 100;

        boolean result1 = box1.compare(box2);
        boolean result2 = box1.compare(box3);
        System.out.println(result1);
        System.out.println(result2);

        Box<Integer> box4 = boxing(100);
        int intValue = box4.get();
        System.out.println(intValue);

        Box<String> box5 = boxing("홍길동");
        String strValue = box5.get();
        System.out.println(strValue);
    }

    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }



}
