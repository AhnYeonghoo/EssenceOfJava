package Chapter7;

public class PointTest {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2();
        System.out.println("p3.x = "+ p3.x);
        System.out.println("p3.y = "+ p3.y);
        System.out.println("p3.z = "+ p3.z);


    }
}

class Point2 {
    int x, y;
    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x: " +x + ", y: " + y;
    }
}

class Point3D extends Point2 {
    int z;
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    String getLocation() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }
}

class Point3 {
    int x = 10;
    int y = 20;
    Point3(int x, int y) {
        // 원래 첫 줄에 최종 조상인 Object 객체의 디폴트 생성자인 Object()가 자동 생성됨
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point3 {
    int z = 30;

    Point3D2() {
        this(100, 200, 300);
    }

    Point3D2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}