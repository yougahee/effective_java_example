package chapter8.item52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReference {
    public static void main(String[] args) {
        //1번
        new Thread(System.out::println).start();

        //2번
        ExecutorService exec = Executors.newCachedThreadPool();
        //exec.submit(System.out::println);
    }
}
