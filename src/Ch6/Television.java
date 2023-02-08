package Ch6;

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }

    public static void main(String[] args) {
        System.out.println(Television.info);
    }
}
