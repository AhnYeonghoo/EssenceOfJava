package Ch6;

public class Car3 {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없다");
            return false;
        }
        System.out.println("gas가 있습니다");
        return true;
    }

    void run() {
        if (gas > 0) {
            System.out.println("달립니다.");
            gas -= 1;
        } else {
            System.out.println("멈춥니다.");
            return;
        }
    }
}
