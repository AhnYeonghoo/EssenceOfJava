package ch7;

public class Calculator {

    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle");
        return 3.14159 * r * r;
    }

    public static void main(String[] args) {

        int r = 10;
        Calculator cal = new Calculator();
        System.out.println(cal.areaCircle(r));
        System.out.println();
        Computer computer = new Computer();
        System.out.println(computer.areaCircle(r));
    }
}

class Computer extends Calculator {

    @Override
    public double areaCircle(double r) {
        System.out.println("COmputer 객체의 areaCircle");
        return Math.PI * r * r;
    }

}
