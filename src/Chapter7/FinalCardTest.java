package Chapter7;

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART",10);
        // c.NUMBER = 5; // final variable not changed
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }

}


