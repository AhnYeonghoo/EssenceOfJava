package Chapter3;

public class OperatorEx4 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;
        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;
        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        signY = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("x=%c%d%n", signY, absY);
        System.out.printf("x=%c%d%n", signZ, absZ);

    }
}
