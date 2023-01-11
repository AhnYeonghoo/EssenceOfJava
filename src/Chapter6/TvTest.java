package Chapter6;


class Tv {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

public class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 channel is " + t1.channel);
        System.out.println("t2 channel is " + t2.channel);

        t1.channel = 7;
        System.out.println(t1.channel+"change");
        System.out.println(t2.channel+ "t2 ");

        t2 = t1;
        t1.channel = 10;
        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }
}
