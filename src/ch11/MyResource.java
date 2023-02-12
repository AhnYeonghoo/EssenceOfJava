package ch11;

import ch8.InterfaceB;

public class MyResource implements AutoCloseable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("[MyResource" + name + ") 열기");
    }

    public String read1() {
        System.out.println(name);
        return "100";
    }

    public String read2() {
        System.out.println(name);
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println(name);
    }

    public static void main(String[] args) {
        try (MyResource res = new MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try (MyResource res = new MyResource("A")) {
            String data = res.read2();
            int value = Integer.parseInt(data);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        try (res1; res2) {
            String data1 = res1.read1();
            String data2 = res2.read2();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
