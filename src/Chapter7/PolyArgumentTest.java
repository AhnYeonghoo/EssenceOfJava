package Chapter7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv3());
        b.buy(new Computer());
        System.out.println("남은돈:"+ b.money);
        System.out.println("보너스금액: " +b.bonusPoint);
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv3 extends Product {
    Tv3() {
        super(100);
    }
    public String toString() {
        return "Tv3";
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+"을 구매하였습니다.");
    }
}
