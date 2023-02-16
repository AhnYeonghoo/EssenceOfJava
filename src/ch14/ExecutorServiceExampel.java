package ch14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExampel {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(5);
        e.shutdownNow();
    }
}
