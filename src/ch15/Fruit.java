package ch15;

import java.util.Comparator;
import java.util.TreeSet;

public class Fruit {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<Fruit>(new FruitComparator());

        ts.add(new Fruit("포도", 3000));
        ts.add(new Fruit("수박",10000));
        ts.add(new Fruit("딸기", 6000));

        for (Fruit f : ts) {
            System.out.println(f.name + ":" + f.price);
        }
    }

}

class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price < o2.price) return -1;
        else if (o1.price == o2.price) return 0;
        else return 1;
    }
}
