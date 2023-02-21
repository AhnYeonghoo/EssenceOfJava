package ch15;

import java.util.Stack;

public class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Stack<Coin> coin = new Stack<Coin>();

        coin.push(new Coin(100));
        coin.push(new Coin(50));
        coin.push(new Coin(500));
        coin.push(new Coin(10));

        while (!coin.isEmpty()) {
            Coin c = coin.pop();
            System.out.println(c.getValue());
        }
    }
}
