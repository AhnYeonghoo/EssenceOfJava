package ch11;

public class ThrowsExample {

    public static void main(String[] args) throws Exception{
        findClass();
    }
    public static void findClass() throws ClassNotFoundException {
        System.out.println("java.lang.String2");
    }
}
