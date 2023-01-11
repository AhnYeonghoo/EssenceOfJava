package Chapter6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width: " + Card.width);
        System.out.println("Card.height: " + Card.height);

        Card c1 = new Card();
        c1.kind = "Spade"; // create Instance Variable
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = 4;
        System.out.println(c1.kind +", " + c1.number + ", "+ c1.width + ", " + c1.height);
        System.out.println(c2.kind +", " + c2.number + ", " +c2.width + ", " + c2.height);
        c1.width = 50;
        c1.height = 80;
        System.out.println(c1.width);
        System.out.println(c1.height);
        System.out.println(c2.width);
        System.out.println(c2.height);
    }
}


class Card {
    String kind;
    int number; // Instance Variable
    static int width = 100; // Class Variable
    static int height = 250;
}