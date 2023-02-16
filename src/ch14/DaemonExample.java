package ch14;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread ast = new AutoSaveThread();
        ast.setDaemon(true);
        ast.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        System.out.println("메인 종료");
    }
}
