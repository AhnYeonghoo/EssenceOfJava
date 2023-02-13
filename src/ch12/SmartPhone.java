package ch12;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + ", " + os;
    }

    public static void main(String[] args) {

        SmartPhone p = new SmartPhone("삼전", "안드로이드");
        String strObj = p.toString();
        System.out.println(p);
    }
}
