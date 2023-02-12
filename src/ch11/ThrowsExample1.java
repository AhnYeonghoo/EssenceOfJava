package ch11;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
