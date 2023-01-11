package Chapter6;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    static int cv2 = new MemberCall().iv; // static 맴버가 instance 맴버를 사용하려면
    // instance를 생성해야만 한다.
    public static void main(String[] args) {


    }

    static void staticMethod1() {
        System.out.println(cv);
        //System.out.println(iv); Error!
        MemberCall m = new MemberCall();
        System.out.println(m.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        MemberCall c = new MemberCall();
        // instanceMethod1(); Error!
        c.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}

