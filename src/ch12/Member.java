package ch12;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            if (id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("re");

        if (obj1.equals(obj2)) {
            System.out.println("obj1 ojb2");
        } else {
            System.out.println("no");
        }
        if (obj1.equals(obj3)) {
            System.out.println("obj1 obj3");
        } else {
            System.out.println("no");
        }

    }

}
