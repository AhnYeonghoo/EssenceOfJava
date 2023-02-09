package Ch6;

public class Korean2 {
    final String nation = "대한민국";
    final String ssn;

    String  name;

    public Korean2(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public static void main(String[] args) {
        Korean2 k1 = new Korean2("123456-1234567", "김자바");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        k1.name = "김자바";
    }
}
