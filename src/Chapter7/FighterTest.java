package Chapter7;

class Unit {
    int currentHp;
    int x;
    int y;
}
interface Movable { void move(int x, int y);}
interface Attackable { void attack(Unit u);}
interface Fightable extends Movable, Attackable {}
class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {
        System.out.println(x+", "+y+" 만큼 이동");
    }
    public void attack(Unit u) {
        System.out.println(u.currentHp+" 만큼 공격");
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("f는 Unit 클래스의 자손입니다");
        }
        if (f instanceof Fightable) {
            System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
        }
        if (f instanceof Movable) {
            System.out.println("f는 Movable인터페이스를 구현하였습니다,.");
        }
        if (f instanceof Attackable) {
            System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
        }
        if (f instanceof Object) {
            System.out.println("f는 Object의 자손입니다.");
        }
    }
}