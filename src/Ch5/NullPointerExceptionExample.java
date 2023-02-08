package Ch5;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0]= 10;
        String str = null;
        System.out.println(str.length());
    }
}
