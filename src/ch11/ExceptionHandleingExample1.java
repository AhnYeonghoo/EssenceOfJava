package ch11;

public class ExceptionHandleingExample1 {
    public static void main(String[] args) {
        System.out.println("program start");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("program exit");
        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
            System.out.println("java.lang.string is find");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
