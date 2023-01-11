package Chapter7;

class Product5 {
    int price;
    int bonusPoint;

    Product5(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
    Product5(){}
}
class Tv5 extends Product5 {
    Tv5() { super(100); }
    public String toString() { return "tv"; }
}
class Computer5 extends Product5 {
    Computer5() {super(200);}
    public String toString() { return "Computer"; }
}
class Audio5 extends Product5 {
    Audio5() {super(50);}
    public String toString() { return "Audio"; }
}
class Buyer5 {
    int money = 1000;
    int bonusPoint = 0;
    Product5[] item = new Product5[10];
    int i = 0;

    void buy(Product5 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p+"을/를 구매하셨습니다.");
    }
    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + " 만원 입니다");
        System.out.println("구입하신 제품은 " + itemList + " 입니다.");
    }
}
public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer5 b = new Buyer5();

        b.buy(new Tv5());
        b.buy(new Computer5());
        b.buy(new Audio5());
        b.summary();
    }

}
