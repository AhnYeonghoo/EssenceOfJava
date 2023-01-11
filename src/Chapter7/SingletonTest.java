package Chapter7;

class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {

    }
    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();
        return s;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        // Singleton s = new Singleton(); -> 직접 인스턴스 생성 불가능
        Singleton s = Singleton.getInstance(); // 스태틱 메서드를 통해 인스턴스를 생성

    }
}
