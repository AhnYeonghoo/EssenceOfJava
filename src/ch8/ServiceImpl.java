package ch8;

public class ServiceImpl implements Service {

    public static void main(String[] args) {
        Service service = new ServiceImpl();
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
    }

}
