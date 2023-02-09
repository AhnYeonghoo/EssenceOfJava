package ch8;

public interface Service {

    default void defaultMethod1() {
        System.out.println("DefaultMethod1 code");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("DefaultMethod2 code");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("DefaultMethod 중복코드A");
        System.out.println("DefaultMethod 중복코드B");
    }

    static void staticMethod1() {
        System.out.println("StaticMethod1 code");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 code");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("staticMethod code1");
        System.out.println("staticMethod code2");
    }
}
