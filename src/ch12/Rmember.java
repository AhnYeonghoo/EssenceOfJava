package ch12;

public record Rmember(String id, String name, int age) {
    public static void main(String[] args) {
        Rmember r = new Rmember("winter", "눈송이", 25);
        System.out.println(r.id());
        System.out.println(r.name());
        System.out.println(r.age());
        System.out.println(r.toString());
        System.out.println();
        Rmember m1 = new Rmember("winter", "눈송이", 25);
        Rmember m2 = new Rmember("winter", "눈송이", 25);
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));

    }
}
